# Junior Developer Entry Task

A simple Spring Boot REST API project built as part of the junior developer onboarding task.

## How to Run the Spring Boot App

1. Open the project in IntelliJ IDEA
2. Run GreetingApplication.java
3. The app will start on port 8080

## How to Test the GET Endpoint

curl http://localhost:8080/api/greeting

Expected response:
{"message":"Hello from Spring Boot"}

## How to Test the POST Endpoint

curl -X POST http://localhost:8080/api/greeting \
  -H "Content-Type: application/json" \
  -d '{"name":"Rawan"}'

Expected response:
{"message":"Hello, Rawan"}

## How to Run the Bash Script

bash bash-practice.sh

## Git Branch Used

feature/entry-task

## Pull Request

https://github.com/roro316r/junior-dev-entry-task/pull/1

## Challenges Faced

Setting up the project and understanding Spring Boot annotations for the first time. I resolved this by reading the documentation and testing each part step by step.
