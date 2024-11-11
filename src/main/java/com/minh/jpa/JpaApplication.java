package com.minh.jpa;

import com.github.javafaker.Faker;
import com.minh.jpa.models.Author;
import com.minh.jpa.models.Video;
import com.minh.jpa.repositories.AuthorRepository;
import com.minh.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	/*
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videoRepository
	){
		return args -> {
			for (int i = 0; i < 50; i++){
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(19,50))
						.email("contact" + i + "@gmail.com")
						.build();
				repository.save(author);
			}
		};
	}

	*/
}
