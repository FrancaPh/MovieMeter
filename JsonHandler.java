package com.br;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class JsonHandler {

    public static List<Movie> parseMovies(String json) {
        List<Movie> movies = new ArrayList<>();

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonArray resultsArray = jsonObject.getAsJsonArray("results");

        for (JsonElement element : resultsArray) {
            JsonObject movieObject = element.getAsJsonObject();
            Movie movie = parseMovie(movieObject);
            movies.add(movie);
        }

        return movies;
    }

    private static Movie parseMovie(JsonObject movieObject) {
        Movie movie = new Movie();
        movie.setId(movieObject.get("id").getAsInt());
        movie.setTitle(movieObject.get("title").getAsString());
        movie.setOverview(movieObject.get("overview").getAsString());
        movie.setPosterPath(movieObject.get("poster_path").getAsString());
        movie.setReleaseDate(movieObject.get("release_date").getAsString());
        movie.setVoteAverage(movieObject.get("vote_average").getAsDouble());
        return movie;
    }
}
