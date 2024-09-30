package com.sid.main.beans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	@Autowired
	private LocalDate ldt;
	
	public String findSeason() 
	{
		
	int month = ldt.getMonthValue();
	
	if(month>=3 && month<=6)
		return "Summer Season";
	
	else if(month>=7 && month<=8)
		return "Rainy Season";
	
	else
		return "Winter Season";
	
	}

}

