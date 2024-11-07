# ForoHub - Backend Challenge

This project is part of the ForoHub challenge, where we developed a REST API using Spring to manage topics.

<p align="center">
<img src="https://github.com/VSawyerHub/ForoHub/blob/master/Badge-Spring.png" />
</p>

This is our challenge, called ForumHub: in it, we will replicate this process at the back end level and, for this, we will create a REST API using Spring.

Our API will focus specifically on topics, and should allow users to:

Create a new topic;
Show all created topics;
Show a specific topic;
Update a topic;
Delete a topic.
This is what we normally know as CRUD (CREATE, READ, UPDATE, DELETE)* and it is very similar to what we developed in LiterAlura, but now in a complete way, adding the UPDATE and DELETE operations, and using a framework that will make it much easier. our work.

*Free translation (in order): Create, Consult, Update and Delete.

In summary, our objective with this challenge is to implement a REST API with the following functionalities:

API with routes implemented following the best practices of the REST model;
Validations carried out according to business rules;
Implementation of a relational database for information persistence;
Authentication/authorization service to restrict access to information.

## Functionalities

The API allows users to perform the following operations:

- **Create a new topic**: Allows a user to create a new topic with title, content and author.
- **List all topics**: Returns a list of all existing topics.
- **Search a specific topic**: Returns the details of a specific topic based on the ID.
- **Update a topic**: Allows you to update the title and/or content of an existing topic.
- **Delete a topic**: Removes a topic from the database.

## Technologies Used

- **Spring Boot**: Framework used to create the application in Java.
- **Spring Data JPA**: Facilitates access and persistence of data in relational databases.
- **H2 Database**: In-memory database to facilitate development and testing.
- **Maven**: Project dependency and build manager.


## How to use

### Prerequisites

- JDK 8 or higher
- Maven
- IDE of your choice (Eclipse, IntelliJ IDEA, etc.)

### Settings

1. Clone the repository:
 ```bash
 git clone git@github.com:VSawyerHub/ForoHub.git

