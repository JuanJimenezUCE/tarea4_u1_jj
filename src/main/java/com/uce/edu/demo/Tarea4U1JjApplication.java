package com.uce.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tarea4U1JjApplication implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(Tarea4U1JjApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Tarea 4 en Spring Framework");
	}

}
