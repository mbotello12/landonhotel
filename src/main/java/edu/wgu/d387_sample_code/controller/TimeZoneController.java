package edu.wgu.d387_sample_code.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TimeZoneController {


    @RequestMapping("/presentation")
    public String getPresentationTimes() throws ExecutionException, InterruptedException {

            TimeZone times = new TimeZone();

            return times.getTimes();
    }
}
