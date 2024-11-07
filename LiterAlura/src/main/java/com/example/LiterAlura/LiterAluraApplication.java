package com.example.LiterAlura;


import repository.BookRepository;
import repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private WriterRepository writerRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

}
