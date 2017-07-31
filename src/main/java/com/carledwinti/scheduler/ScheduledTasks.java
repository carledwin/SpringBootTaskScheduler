package com.carledwinti.scheduler;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	@Scheduled(fixedRate=40000)
	public void performTask() {
		System.out.println("Regular task performed at: " + dateFormat.format(Calendar.getInstance().getTime()));
	}
	
	@Scheduled(initialDelay= 500, fixedRate=40000)
	public void performDelayedTask() {
		System.out.println("Deleyed Regular task performed at: " + dateFormat.format(Calendar.getInstance().getTime()));
	}
	
	@Scheduled(cron="*/5 * * * * *")
	public void performTaskUsingCron() {
		System.out.println("Regular task performed using Cron at: " + dateFormat.format(Calendar.getInstance().getTime()));
	}
}
