package com.example.Movie;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("MONGO_USER", dotenv.get("MONGO_USER"));
		System.setProperty("MONGO_PASSWORD", dotenv.get("MONGO_PASSWORD"));
		System.setProperty("MONGO_CLUSTER", dotenv.get("MONGO_CLUSTER"));
		System.setProperty("MONGO_DATABASE", dotenv.get("MONGO_DATABASE"));

		SpringApplication.run(MovieApplication.class, args);
	}

}