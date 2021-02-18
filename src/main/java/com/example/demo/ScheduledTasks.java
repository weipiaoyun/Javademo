package  com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 2000)
    private void reportCurrentTime(){
        log.info("The time is now {}",dataFormat.format(new Date()));
    }

    @Scheduled(fixedRate = 2000)
    private void reportCurrentTime1(){
        log.info("The 111 time is now {}",dataFormat.format(new Date()));
    }

}
