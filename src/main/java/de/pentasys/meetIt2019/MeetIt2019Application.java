package de.pentasys.meetIt2019;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MeetIt2019Application {

	public static void main(String[] args) {
		SpringApplication.run(MeetIt2019Application.class, args);
	}

}
