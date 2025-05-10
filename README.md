# 📚 Book Catalog API - Oracle ONE

This is the Book Catalog, a project developed as part of the challenge proposed in the `Java and Spring Framework T6 - ONE` training, which belongs to the Oracle ONE program curriculum.

## 💡 Objective

The objective of this challenge was to provide a real-world development experience. Students were tasked with building a `REST API` that would serve as the `backend` for a book catalog application, implementing a complete `CRUD` functionality.

This project generates its own data through all the necessary `endpoints` to perform CRUD operations. It's worth mentioning that this API persists data in a `MySQL` database using the `Spring Data JPA` API from `Spring Boot`.

## 📌 Dependencies

For the proper functioning of the Book Catalog, it's necessary to install the dependencies below. Click on the hyperlink for each one to go to the respective download page.
- [`MySQL`](https://dev.mysql.com/downloads/installer/): Database used by Book Catalog
- [`Maven`](https://maven.apache.org/install.html): Dependency manager used by Book Catalog

## ⚙️ Configuration

Before running the project, we must configure some environment variables on our machine.

Below are the variables that should be created and the content each should contain:
| Variable | Content | Example |
| --- | --- | --- |
| `DB_BOOKCATALOG_API_HOST` | Database host. The address to access it along with the port | 127.0.0.1:3306 |
| `DB_BOOKCATALOG_API_DATABASE` | Specifies the name of the database that Book Catalog will use | book_catalog |
| `DB_BOOKCATALOG_API_USER` | Specifies the username to connect to the database | root |
| `DB_BOOKCATALOG_API_PASSWORD` | Specifies the password of the user defined in the previous variable | 10203040 |
| `JWT_BOOKCATALOG_API_SECRET` | Specifies the secret key used to sign and verify the authenticity of JWT tokens. It should be a random and secret number. | 91723847 |

## 🚀 Usage

There are two options to run the project:

### Option 1
Open the project with `IntelliJ IDEA` IDE and run the method below in the `BookCatalogApplication` class:

```java
public static void main(String[] args)
```

### Option 2
Enter the project folder through the terminal and run the command below:

```
mvn spring-boot:run
```
> [!NOTE]
> If you encounter problems with Maven when running Book Catalog, install version `3.9.5`, which was used in the construction of the project.

After running the program, send a request to the `/login` endpoint, providing email and password in a `JSON` format (these should be previously registered in the database in the `Users` table, with the password encrypted by BCrypt), to get the `JWT Token`.

Then, simply use the other endpoints normally to perform the desired actions, providing the JWT Token for authentication. It's worth mentioning that the JWT Token has a maximum duration of `two hours`, meaning a new JWT Token needs to be obtained every two hours.

## ⚠️ Warnings
1. This project was built and tested on JDK 17, so we recommend using it when executing the project.

## 🌐 Repository Structure
This project is part of a larger repository divided into three branches:
- ONE branch: Contains this Book Catalog project developed with Spring
- [Other branches contain different challenges from the Oracle ONE Program]

Visit the complete repository at: [https://github.com/VSawyerHub/ProgramaONE_Challenges](https://github.com/VSawyerHub/ProgramaONE_Challenges/tree/3three)
