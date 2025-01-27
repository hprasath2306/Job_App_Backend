
# Job App using Spring boot [Microservices]

The project is a job application backend built with Spring Boot using a microservices architecture.


## Features

- Communication: Services talk to each other using OpenFeign and Eureka for discovery.
- Request Tracking: Zipkin is used to trace and monitor requests.
- Unified Endpoints: An API Gateway simplifies access to services.
- Resilience: Resilience4J ensures fault tolerance and circuit breaking.
- Messaging: RabbitMQ enables smooth communication between services.
- Containerization: Services run in Docker containers, orchestrated with a docker-compose.yaml.


## System Architecture

![Job App](https://github.com/user-attachments/assets/e7fed858-e1f3-402c-959a-c455eefd3b44)

