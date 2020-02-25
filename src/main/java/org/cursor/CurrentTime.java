package org.cursor;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
@EnableScheduling
public class CurrentTime {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

    @Scheduled(cron = "*/1 * * * * ?")
    public void showTime() {
        Date currentTime = new Date();
        System.err.println("Current time now: " + DATE_FORMAT.format(currentTime));
    }
}