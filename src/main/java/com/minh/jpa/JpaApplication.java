package com.minh.jpa;

import com.minh.jpa.models.Author;
import com.minh.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
		return args -> {
			 var author = Author.builder()
					 .firstName("Little")
					 .lastName("Kitchy")
					 .age(7)
					 .email("kitchy@biscuit.com")
					 .build();
			 repository.save(author);
		};
	}
}
