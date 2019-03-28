package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
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
	
public static Logger loger=Logger.getLogger(SbcoreApplication.class);
	@PostConstruct
	public void init() {
		loger.info("before initialized...");
		
	}
	@PreDestroy
	public Set<String> destroyt() {
		loger.info("after distroying...");
		Set<String> names= new HashSet<>();
		names.add(new String("siddu"));
		names.add("kamble");
		names.add("hyd");
		names.add("somajiguda");
		return names;
		
	}
	public static void main(String[] args) {
		Motor motor=null;
	ApplicationContext context=	SpringApplication.run(SbcoreApplication.class, args);
	motor = context.getBean("motor",Motor.class);
	SbcoreApplication run= new SbcoreApplication();
	Set<String> name=run.destroyt();
	System.out.println(name);
	System.out.println(motor);
	motor.run();
	
	}

}
