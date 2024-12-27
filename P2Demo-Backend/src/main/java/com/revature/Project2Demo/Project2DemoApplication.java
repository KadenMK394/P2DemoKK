package com.revature.Project2Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.revature.models")
@ComponentScan("com.revature")
@EnableJpaRepositories("com.revature.DAOs")
public class Project2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2DemoApplication.class, args);

		System.out.println("We are running!");
	}
}
