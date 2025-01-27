package com.hprasath.Job_app_Ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JobAppMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobAppMsApplication.class, args);
	}

}
