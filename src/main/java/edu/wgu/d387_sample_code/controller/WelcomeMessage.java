package edu.wgu.d387_sample_code.controller;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;
import java.util.Properties;

public class WelcomeMessage implements Runnable {

    private String propertyName;
    private String welcomeMessage;

    public WelcomeMessage(String propertyName) {
        this.propertyName = propertyName;
    }
    Properties properties = new Properties();

    public String getMessage() {
        try{
            InputStream stream = new ClassPathResource(propertyName).getInputStream();
            properties.load(stream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties.getProperty("welcome");
    }

    @Override
    public void run() {
        try{
            InputStream stream = new ClassPathResource(propertyName).getInputStream();
            properties.load(stream);
            this.welcomeMessage = properties.getProperty("welcome");

            System.out.println(welcomeMessage);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("WelcomeMessage run exception");
        }
    }

}
