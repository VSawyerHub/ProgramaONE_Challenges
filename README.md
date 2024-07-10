# Currency Converter - Java Backend Project

This project is a Java backend application for a Currency Converter, allowing users to convert between different currencies based on current exchange rates.

## Features

- **Currency Conversion:** Converts an amount from one currency to another.
- **Latest Exchange Rates:** Utilizes the latest exchange rates provided by an external API (e.g., Fixer.io, ExchangeRatesAPI.io).
- **Historical Rates:** Optionally supports historical exchange rates for specific dates.

## Technologies Used

- **Java:** Core programming language.
- **Spring Framework:** Used for dependency injection, MVC architecture, and RESTful services.
- **External API:** Integrates with an external API to fetch exchange rates.
- **JSON Parsing:** Handles JSON data to retrieve and parse exchange rate information.
- **JUnit:** Unit testing framework for testing currency conversion logic.

## Setup Instructions

1. **Clone the repository:**


2. **Navigate to project directory:**
cd currency-converter


3. **Build the project:**
mvn clean install


4. **Run the application:**



## Usage

- **Input:** Provide the source currency, target currency, and amount to convert.
- **Output:** Display the converted amount based on the latest exchange rate fetched from the API.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

