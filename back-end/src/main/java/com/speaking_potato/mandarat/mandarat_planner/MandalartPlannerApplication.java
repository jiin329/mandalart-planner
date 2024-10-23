package com.speaking_potato.mandarat.mandarat_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MandalartPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MandalartPlannerApplication.class, args);
	}

}
