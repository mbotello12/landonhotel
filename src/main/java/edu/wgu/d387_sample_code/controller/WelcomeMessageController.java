package edu.wgu.d387_sample_code.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeMessageController {


    @RequestMapping(path ="/welcome", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String[] getWelcomeMessage() throws ExecutionException, InterruptedException {

        ExecutorService messageExecutor = Executors.newFixedThreadPool(2);

            Future<String> messageFuture1 = messageExecutor.submit(() -> new WelcomeMessage("welcome_english_US.properties").getMessage());
            Future<String> messageFuture2 = messageExecutor.submit(() -> new WelcomeMessage("welcome_french_CA.properties").getMessage());

            String message1 = messageFuture1.get();
            String message2 = messageFuture2.get();

            return new String[]{message1, message2};

    }
}
