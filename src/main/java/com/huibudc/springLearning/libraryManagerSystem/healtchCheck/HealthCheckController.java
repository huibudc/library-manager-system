package com.huibudc.springLearning.libraryManagerSystem.healtchCheck;

import com.huibudc.springLearning.libraryManagerSystem.pojos.HealthCheck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class HealthCheckController {
    private static final Logger logger = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping("/health")
    public HealthCheck health() {
        logger.info("Health check request");
        return new HealthCheck(true, new Date());
    }
}
