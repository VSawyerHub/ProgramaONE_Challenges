# 📚 Forum Hub API - Oracle ONE
This is the Forum Hub, a project from the second challenge proposed in the `Java and Spring Framework T6 - ONE` training, which is part of the Oracle ONE program.

## 💡Objective

The ForuHub project is a Rest API built in Java and Spring with authentication and authorization control using Spring Security and unit tests using JUnit and Mockito.

ForuHub allows the user to access, register, edit, and delete topic records by saving the data to a local Postgres database.

In the [`last project`](https://github.com/gPagio/bootcamp-oracle-alura-challenge-literalura) built by Oracle One, the data came from the Gutendex API. The current project generates its own data, since it has all the `endpoints` necessary to perform a CRUD. It is worth mentioning that this API persists the data in a `PostgreSQL` database through the `Spring Boot` API called `Spring Data JPA`.

## 📌 Dependencies
For the Hub Forum to work correctly, you need to install the dependencies below. Click on the hyperlink in each one to go to the respective downloads page.
- [`PostgreSQL`](https://www.postgresql.org/download/): Database used by the Hub Forum
- [`Maven`](https://maven.apache.org/install.html): Dependency manager used by the Hub Forum

## 🚀 Usage
To run the project, we have two options:

### 1st Option
Open it with the `IntelliJ IDEA` IDE and run the method below in the `ForumhubApplication` class:

``` Java
public static void main(String[] args)
```

### 2nd Option
Enter the project folder through the terminal and run the command below:

```
mvn spring-boot:run
```

## 🔄 Features

- Listing saved topics.
- Details of saved topics.
- Topic register.
- Editing in the topic register.
- Logical deletion of the topic record.

> [!NOTE]
> If you encounter problems with Maven when running the Hub Forum, install version `3.9.5`, which was used to build the project.

After running the program, send a request to the `/login` endpoint, informing the email and password in a `JSON` (these must be previously registered in the database in the `Users` table, with the password encrypted by BCrypt), to get the `JWT Token`.

Then, simply use the other endpoints as normal to perform the desired actions, providing the JWT Token to perform your authentication. It is worth mentioning that the JWT Token has a maximum duration of `two hours`, that is, every two hours it is necessary to obtain a new JWT Token.

## ⚠️ Warnings
1. This project was built and tested on JDK 17, so we recommend using it when running it.

## 👨‍💻 Technologies Used

- Java 17
- Spring Boot
- Spring Security
- Jpa
- Postgresql
- Lombok
- Maven
- Unit tests (JUnit, Mockito)


