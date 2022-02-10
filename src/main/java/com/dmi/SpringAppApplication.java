package com.dmi;

import com.dmi.model.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.UUID;

@SpringBootApplication
public class SpringAppApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

	@PostConstruct
	public void postConstruct(){
		UserEntity userEntity = UserEntity.builder()
											.userId(UUID.randomUUID().toString())
											.email("abc@test.com")
											.authString("password")
											.build();
		LOGGER.info("Post-Construct: userEntity built.");
	}

}
