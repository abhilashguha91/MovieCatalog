package io.moviecatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"io.moviecatalog.ratingsdataservice"})
@EntityScan("io.moviecatalog.ratingsdataservice")
public class RatingsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}

}
