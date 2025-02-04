# HNG Stage 0

### Overview

The **HNG Stage-0** project is a Spring Boot application designed to manage and display information of the current project. This project may provide a simple and efficient way to keep track of project details at real time, ensuring that the information is easily accessible and manageable.

### Features

+ **Display Project Information**: View project information using keys.
+ **RESTful API**: Exposed endpoints to interact with the project data.
+ **Spring Boot**: Utilizes the Spring Boot framework for rapid development and deployment.

### Endpoint

+ GET `/api/project-details`: Retrieves project information in json. As seen below is an example result obtained when the url is followed.
  
```json
    {
        "current_datetime": "real-time-example-'2025-01-30T09:25:41.683947400Z'",
        "email": "<developer-email>.@example.com",
        "github_url": "https://github.com/<developer-github-username>/<current-project-repository>.git"
    }
  ```

### Getting Started


### Usage

Once the application is running, you can access the project information by navigating to ***<>*** in your web browser or by making a GET request to the ***<>*** endpoint.

### Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

### License

&copy; 2024 Oluwafisayomi Folaranmi. All rights reserved.
