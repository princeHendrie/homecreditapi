package com.homecredit.test;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan()
public class HomecreditApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomecreditApiApplication.class, args);
	}

}
