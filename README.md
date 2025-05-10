# 📚 Forum Hub API - Oracle ONE
This is the Forum Hub, a project from the second challenge proposed in the `Java and Spring Framework T6 - ONE` training, which is part of the Oracle ONE program.

## 💡Objective
The objective of this challenge was to provide real experience in the world of development. The students were asked to build a `Rest API`, which would be the `backend` of a forum performing a `CRUD`.

In the [`last project`](https://github.com/gPagio/bootcamp-oracle-alura-challenge-literalura) built by Oracle One, the data came from the Gutendex API. The current project generates its own data, since it has all the `endpoints` necessary to perform a CRUD. It is worth mentioning that this API persists the data in a `MySQL` database through the `Spring Boot` API called `Spring Data JPA`.

## 📌 Dependencies
For the Hub Forum to work correctly, you need to install the dependencies below. Click on the hyperlink in each one to go to the respective downloads page.
- [`MySQL`](https://dev.mysql.com/downloads/installer/): Database used by the Hub Forum
- [`Maven`](https://maven.apache.org/install.html): Dependency manager used by the Hub Forum

## ⚙️ Settings
Before running the project, we must configure some environment variables on our machine.

Below are listed the variables that must be created and the content that each one must contain:
|Variable|Content|Example|
|---|---|---|
|`DB_FORUMHUB_API_HOST`|Database host. The address to access it along with the port|127.0.0.1:3306|
|`DB_FORUMHUB_API_DATABASE`|Informs the name of the database that the Forum Hub will persist|forum_hub|
|`DB_FORUMHUB_API_USER`|Informs the username to connect to the database|root|
|`DB_FORUMHUB_API_PASSWORD`|Informs the password of the user defined in the previous variable|10203040|
|`JWT_FORUMHUB_API_SECRET`|Informs the secret key used to sign and verify the authenticity of JWT tokens. It must be a random and secret number.|91723847|

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
> [!NOTE]
> If you encounter problems with Maven when running the Hub Forum, install version `3.9.5`, which was used to build the project.

After running the program, send a request to the `/login` endpoint, informing the email and password in a `JSON` (these must be previously registered in the database in the `Users` table, with the password encrypted by BCrypt), to get the `JWT Token`.

Then, simply use the other endpoints as normal to perform the desired actions, providing the JWT Token to perform your authentication. It is worth mentioning that the JWT Token has a maximum duration of `two hours`, that is, every two hours it is necessary to obtain a new JWT Token.

## ⚠️ Warnings
1. This project was built and tested on JDK 17, so we recommend using it when running it.
