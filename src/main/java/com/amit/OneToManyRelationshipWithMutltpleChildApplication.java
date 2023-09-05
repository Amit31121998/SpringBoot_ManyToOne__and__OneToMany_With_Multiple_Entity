package com.amit;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyRelationshipWithMutltpleChildApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyRelationshipWithMutltpleChildApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
