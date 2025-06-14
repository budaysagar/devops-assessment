# DevOps Assessment
This repository contains implementation of a application that;

- Calls the REST API: "https://httpbin.org/json"
- Extracts the title field inside the slideshow object
- Prints the title to the console

# Python Version

- Uses the requests library to perform a GET request to the API.
- Parses the JSON response using ".json()"
- Extracts and prints slideshow.title if available.

# Python Dependencies (requirements.txt) (for code reusability)
requests

# Build and run
cd python-version

docker build -t my_image .

docker run my_image

# Java Version (Bonus Task)

- Uses HttpURLConnection to fetch the JSON.
- Parses the JSON using Gson.
- Retrieves slideshow.title and prints it to the console.

# Maven pom.xml

- Java 21 enabled
- Gson added as a dependency
- maven-shade-plugin used to build an executable fat JAR

# Multi-stage build Dockerfile

Stage 1: Compiles the project and builds a shaded JAR with Maven

Stage 2: Runs the JAR using OpenJDK 21 on UBI minimal

# Build and Run

cd java-version

docker build -t my_image .

docker run my_image

# Cloning the repository

git clone https://github.com/budaysagar/devops-assessment.git

cd devops-assessment

