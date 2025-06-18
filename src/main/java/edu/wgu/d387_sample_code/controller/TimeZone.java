package edu.wgu.d387_sample_code.controller;


import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "*")
public class TimeZone {

    ZoneId zEastern=ZoneId.of("America/New_York");
    ZoneId zMountain=ZoneId.of("America/Denver");
    ZoneId zUTC=ZoneId.of("UTC");
    ZoneId zoneId=ZoneId.systemDefault();

public String getTimes() {
    LocalDateTime localDateTime=LocalDateTime.now();
    ZonedDateTime zonedDateTime=localDateTime.atZone(zEastern).withHour(12).withMinute(0);

    ZonedDateTime zonedDateTimeEastern=zonedDateTime.withZoneSameInstant(zEastern);
    LocalDateTime localDateTimeEastern=zonedDateTimeEastern.toLocalDateTime();

    ZonedDateTime zonedDateTimeMountain=zonedDateTime.withZoneSameInstant(zMountain);
    LocalDateTime localDateTimeMountain=zonedDateTimeMountain.toLocalDateTime();

    ZonedDateTime zonedDateUTC=zonedDateTime.withZoneSameInstant(zUTC);
    LocalDateTime localDateUTC=zonedDateUTC.toLocalDateTime();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
    String presentationTimes = localDateTimeEastern.format(formatter) + " ET | " + localDateTimeMountain.format(formatter) + " MT | " + localDateUTC.format(formatter) + " UTC." ;
    System.out.println(presentationTimes);
    return presentationTimes;
}

}
