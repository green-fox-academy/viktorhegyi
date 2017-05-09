package com.greenfox;

import com.greenfox.model.Todo;
import com.greenfox.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosApplication implements CommandLineRunner {

	@Autowired
	Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("Start the day"));
		repository.save(new Todo("Finish H2 workshop1"));
		repository.save(new Todo("Finsih JPA workshop2"));
		repository.save(new Todo("Creat CRUD project"));

	}
}
