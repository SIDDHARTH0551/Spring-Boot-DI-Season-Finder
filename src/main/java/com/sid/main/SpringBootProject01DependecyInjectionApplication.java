package com.sid.main;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sid.main.beans.SeasonFinder;

@SpringBootApplication
public class SpringBootProject01DependecyInjectionApplication {

    @Bean(name="ld")
    LocalDate createDate()
    {
		return LocalDate.now();
		
	}

	public static void main(String[] args) {
		
	//get IOC Container
	ApplicationContext ctx=SpringApplication.run(SpringBootProject01DependecyInjectionApplication.class, args);
	
	//get Target Spring bean class obj
	SeasonFinder finder = ctx.getBean("sf",SeasonFinder.class);
	
	//Invoke the b.method
	String seasonName= finder.findSeason();
	System.out.println("Season Name:: "+seasonName);
	
	//Close the IOC Container
	((ConfigurableApplicationContext)ctx).close();
	
	
	
	}

}
