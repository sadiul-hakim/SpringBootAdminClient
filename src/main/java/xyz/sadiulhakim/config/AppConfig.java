package xyz.sadiulhakim.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@EnableCaching
public class AppConfig {
    @Scheduled(fixedRate = 100000)
    public void scheduleFixedRateTask() {
        System.out.println(
                "Fixed rate task - " + System.currentTimeMillis() / 1000);
    }
}
