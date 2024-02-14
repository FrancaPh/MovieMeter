package com.br;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlGenerator {

    public static void generateHtml(List<Movie> movies) {
        try (FileWriter fileWriter = new FileWriter("index.html")) {
            String htmlContent = """
                <!DOCTYPE html>
                <html lang="en">
                
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                
                    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
                        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
                
                    <title>MovieMeter</title>
                    <link rel="icon" href="https://cdn-icons-png.flaticon.com/512/73/73960.png">
                </head>
                
                <body>
                    <header>
                        <div class="navbar navbar-dark bg-dark box-shadow">
                            <div class="container d-flex justify-content-between">
                                <a href="#" class="navbar-brand d-flex align-items-center">
                                    <strong>TOP 20 HIGHEST-RATED MOVIES</strong>
                                </a>
                            </div>
                        </div>
                    </header>
                    <main role="main">
                        <section class="jumbotron text-center">
                            <div class="container">
                                <h1 class="jumbotron-heading">MovieMeter</h1>
                                <p class="lead text-muted">This site represents an academic challenge where the goal was to retrieve and
                                    display the top 20 highest-rated movies using an API integration. Through code implementation, the
                                    platform fetches data from an external source and curates a list of the most esteemed films based on
                                    user ratings. Utilizing HTML generation directly from the code, each movie entry includes essential
                                    details such as its title, synopsis, release date, average rating, and vote count, providing
                                    visitors
                                    with comprehensive information about each film</p>
                            </div>
                        </section>
                        <div class="album py-5 bg-light">
                            <div class="container">
                                <div class="row">
                """;

            for (Movie movie : movies) {
                htmlContent += String.format("""
                <div class="col-lg-3">
                    <div class="card text-white bg-light border-secondary mb-3" style="max-width: 18rem;">
                        <h4 class="card-header border-secondary"> %s</h4>
                        <img class="card-img-top" src= %s alt= %s>
                        <div class="card-body">
                            <p class="card-text"> %s</p>
                        </div>
                        <div class="card-footer border-secondary">
                            <h6 class="card-text mt-2">Nota: %s</h6>
                            <h6 class="card-text mt-2">Lançamento: %s</h6>
                        </div>
                    </div>
                </div>
                    """,
                        movie.getTitle(),
                       "https://image.tmdb.org/t/p/w500" + movie.getPosterPath(),
                        movie.getTitle(),
                        movie.getOverview(),
                        movie.getVoteAverage(),
                        movie.getReleaseDate()
                );
            }

            htmlContent += """
                </div>
            </div>
        </div>
    </main>
    <footer class="text-muted">
        <div class="container">
            <p>Copyright © 2024 Pedro Henrique Franca</p>
        </div>
    </footer>
</body>

</html>
                """;

            fileWriter.write(htmlContent);
            System.out.println("HTML file generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
