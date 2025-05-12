## 🌐 Repository Structure
> [!IMPORTANT]
> This project is part of a larger repository divided into three branches:
> - ONE branch: Contains this Book Catalog project developed with Spring
> - [Other branches contain different challenges from the Oracle ONE Program]

<br>

# 💱 Currency Converter API - Oracle ONE

This is the Currency Converter API, a project developed as part of the challenge proposed in the `Java and Spring Framework T6 - ONE` training, which belongs to the Oracle ONE program curriculum.

## 💡 Objective

The objective of this challenge was to provide a real-world development experience. Students were tasked with building a `REST API` using Spring Framework that functions as a currency converter, allowing users to convert between different currencies using real-time exchange rates.

Unlike previous projects in the Oracle ONE program that consumed external APIs, this project not only connects to external currency exchange APIs but also implements a complete `CRUD` system for managing conversion history and user preferences.

## 📌 Dependencies

For the proper functioning of the Currency Converter API, it is necessary to install the dependencies below. Click on the hyperlink for each one to go to the respective download page.
- [`Java`](https://www.oracle.com/java/technologies/downloads/): For running applications on desktops or laptops
- [`Maven`](https://maven.apache.org/install.html): Dependency manager used by the Currency Converter API

## 🚀 Usage

To run the project, we have two options:

### 1st Option
Open the project with `IntelliJ IDEA` IDE and run the method below in the `CurrencyConverterApplication` class:

```java
public static void main(String[] args) {
    SpringApplication.run(CurrencyConverterApplication.class, args);
}
```

### 2nd Option
Navigate to the project folder in your terminal and execute the command below:

```
mvn spring-boot:run
```

## 🔄 Features

- Real-time currency conversion
- Historical exchange rates
- Conversion history tracking
- User preference management

## ⚠️ Notes

1. This project was built and tested using JDK 17, so we recommend using it when running the application.
2. Remember to set all environment variables before running the application.
3. To use the currency conversion functionality, you will need a valid API key from a currency exchange rate provider.

## 🌐 Project Structure

The project follows a standard Spring Boot application structure:
- `src/main/java`: Java source code
- `src/main/resources`: Configuration files and static resources
- `src/test`: Test classes

## 👨‍💻 Technologies Used

- Java 17
- Spring Boot
