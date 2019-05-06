package cn.cloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class CloudtestExcuteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudtestExcuteServiceApplication.class, args);
	}

}
