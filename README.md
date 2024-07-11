# Todo API

This project is a simple Todo API implemented using Spring Boot and Gradle.

## Requirements

- Java 21
- Gradle

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository:

   ```
   git clone https://github.com/augustosplett/todo-api.git
    ```

2. Navigate to the project directory:

    ```
    cd todo-api
    ```
3. Build the project using Gradle:
    ```
    ./gradlew build
    ```
4. Run the application:
    ```
    ./gradlew bootRun
    ``` 

# API Documentation
## Create a Task

Endpoint: __POST /api/tasks__ 

Example request body:
  ```
    {
      "title": "Task Title",
      "description": "Task Description",
      "done": false
    }
  ```

## Get All Tasks

Endpoint: __GET /api/tasks__
## Get Task by ID

Endpoint: __GET /api/tasks/{taskId}__
## Update a Task

Endpoint: __PUT /api/tasks/{taskId}__

Example request body for updating:

  ``` 
  {
    "title": "Updated Task Title",
    "description": "Updated Task Description",
    "done": true
  }
  ```

## Delete a Task

Endpoint: __DELETE /api/tasks/{taskId}__

## License
TBD
