package com.br;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

class Main {

	public static void main(String[] args) throws Exception {

		String apiKey = "YOUR API KEY";
		URI apiTMDB = URI.create("https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1");
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
			.uri(apiTMDB)
			.header("accept", "application/json")
			.header("Authorization", apiKey)
			.method("GET", HttpRequest.BodyPublishers.noBody())
			.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();

//		System.out.println("Resposta: " + json);

        List<Movie> movies = JsonHandler.parseMovies(json);

/* 
       for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Overview: " + movie.getOverview());
            System.out.println("Poster Path: " + movie.getPosterPath());
            System.out.println("Release Date: " + movie.getReleaseDate());
            System.out.println("Vote Average: " + movie.getVoteAverage());
            System.out.println();
        }
*/
        
        HtmlGenerator.generateHtml(movies);
	}
}
