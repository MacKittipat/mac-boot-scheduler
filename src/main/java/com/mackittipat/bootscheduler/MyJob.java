package com.mackittipat.bootscheduler;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyJob {

    @Scheduled(fixedRate = 5000)
    @SchedulerLock(name = "TaskScheduler_myJob", lockAtLeastFor = "PT60S")
    public void execute() {
        log.info("Running ...");
    }
}
