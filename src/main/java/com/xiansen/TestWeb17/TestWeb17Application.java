package com.xiansen.TestWeb17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

// 开启基于注解的定时任务
@EnableScheduling
@SpringBootApplication
public class TestWeb17Application {

	public static void main(String[] args) {
		SpringApplication.run(TestWeb17Application.class, args);
	}

}
