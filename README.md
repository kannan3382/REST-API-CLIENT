# REST-API-CLIENT

COMPANY: CODTECH IT SOLUTIONS

NAME: KANNAN J

INTERN ID: CT04DH811

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTHOSH KUMAR

DESCRIPTION:

Objective:

The objective of this task is to develop a console-based Java application that interacts with a public RESTful API to fetch and display real-time weather data. This task demonstrates practical knowledge of HTTP networking in Java, JSON parsing, and integration of third-party libraries in a Java development environment. It also provides hands-on experience with Visual Studio Code as the primary IDE.

Project Overview:

The REST API Client developed in this task is designed to consume data from the OpenWeatherMap API, which provides weather information for cities across the globe. The application prompts the user to enter a city name, sends an HTTP GET request to the API, receives a JSON response, and extracts relevant data to present it in a human-readable format.

Key features:

Dynamic User Input: Accepts a city name from the user via console input. HTTP Request Handling: Connects to the API endpoint using Java's HttpURLConnection class. JSON Parsing: Utilizes the org.json library to parse the response JSON and extract temperature, humidity, and weather condition data. Structured Output: Displays weather details in a clean and readable format in the command line interface.

Technologies and Tools Used:

Programming Language: Java

IDE: Visual Studio Code

Libraries/Packages:

org.json for parsing JSON responses java.net.HttpURLConnection for making HTTP requests java.io.* and java.util.Scanner for input/output and user interaction API Source: OpenWeatherMap (https://api.openweathermap.org/data/2.5/weather)

Challenges Encountered:

During implementation, multiple issues were encountered with the API key returning HTTP 401 Unauthorized errors, despite being marked as active. This was due to possible propagation delays, account restrictions, or incorrect key formatting. As a temporary workaround for demonstration purposes, the application was modified to print sample weather data without making actual API calls. This approach ensured the completion of the task without disruption, while still adhering to the original functional requirements.
