package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Day2HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day2HystrixDashboardApplication.class, args);
	}

}
