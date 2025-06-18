package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.controller.TimeZone;
import edu.wgu.d387_sample_code.controller.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		TimeZone time = new TimeZone();
		time.getTimes();


	}

}
