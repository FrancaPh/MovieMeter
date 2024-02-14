![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)
![forthebadge](https://forthebadge.com/images/badges/made-with-crayons.svg)
![forthebadge](https://forthebadge.com/images/badges/not-a-bug-a-feature.svg)

![Star Badge](https://img.shields.io/static/v1?label=%F0%9F%8C%9F&message=If%20Useful&style=style=flat&color=BC4E99)
![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)
[![View My Profile](https://img.shields.io/badge/View-My_Profile-green?logo=GitHub)](https://github.com/FrancaPh)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
# MovieMeter: Top 20 Highest-Rated Movies Generator

## Overview

MovieMeter is a Java application designed to fetch data from The Movie Database (TMDb) API and generate an HTML file displaying the top 20 highest-rated movies. This application is created as part of the 7 Days of Java challenge, aiming to provide practical exercises focusing on important Java concepts while being enjoyable and engaging.

### Challenge Description
During the 7 Days of Java challenge, participants engage in exercises emphasizing fundamental Java concepts. They utilize Java APIs to consume external APIs, retrieve data such as the top 250 movies from IMDb, and manipulate the data within their Java applications. Key concepts include object-oriented modeling, abstraction, constructors, interfaces, encapsulation, and code organization.

## Features

- Fetches data from the TMDb API to retrieve information about the top-rated movies.
- Parses the JSON response to create `Movie` objects.
- Generates an HTML file dynamically to display movie details such as title, poster, overview, release date, and vote average.
- Utilizes Bootstrap for CSS styling to create an appealing user interface.

## Installation

1. Clone or download the repository to your local machine.
2. Ensure you have Java Development Kit (JDK) installed on your system.
3. Open the project in your preferred Java IDE (Integrated Development Environment).

## Usage

1. Open the `SevenDaysOfCodeJava` class in your IDE.
2. Run the `main` method.
3. The application will send a GET request to the TMDb API and fetch the top-rated movies data.
4. It will then generate an HTML file named `index.html` in the project directory.
5. Open the `index.html` file in a web browser to view the list of top-rated movies.

## Dependencies

- Gson library for JSON parsing: [Gson](https://github.com/google/gson)
- Bootstrap for CSS styling: [Bootstrap](https://getbootstrap.com/)

## 7 Days of Java Challenge

### Day 1
On the first day, the Java code consumes the IMDb API, retrieves the top 250 movies, and prints the corresponding JSON to the console.

### Day 2
Parsing the JSON response obtained from IMDb to extract movie information and attributes such as title, poster, rating, etc.

### Day 3
Modeling the code using object-oriented principles. Creating a 'Movie' structure with attributes encapsulated within objects of this type.

### Day 4
Introducing HTML manipulation. The challenge involves generating an HTML page from the list of movie objects, displaying movie information including posters and ratings.

### Day 5
Refining code organization by encapsulating some of the developed calls into new classes.

### Day 6
Making the code more generic to accommodate data from other APIs using interfaces.

### Day 7
Implementing the ability to sort the movie list based on different attributes using the Collections class, Comparable, and Comparator interfaces, culminating the challenge with a comprehensive review of key concepts.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

![forthebadge](https://forthebadge.com/images/badges/works-on-my-machine.svg)
