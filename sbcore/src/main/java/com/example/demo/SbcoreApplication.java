package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Motor;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.nt.bean,com.nt.beans"})
public class SbcoreApplication {
	

	public static void main(String[] args) {
		Motor motor=null;
	ApplicationContext context=	SpringApplication.run(SbcoreApplication.class, args);
	motor = context.getBean("motor",Motor.class);
	System.out.println(motor);
	motor.run();
	
	}

}
