package com.carledwinti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] {SpringBootTaskSchedulerApplication.class}, args);
	}
}
