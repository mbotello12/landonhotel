package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.controller.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		WelcomeMessage englishWelcomeMessage = new WelcomeMessage("welcome_english_US.properties");
		Thread englishThread = new Thread(englishWelcomeMessage.getMessage());
		englishThread.start();

		WelcomeMessage frenchWelcomeMessage = new WelcomeMessage("welcome_french_CA.properties");
		Thread frenchThread = new Thread(frenchWelcomeMessage.getMessage());
		frenchThread.start();
	}

}
