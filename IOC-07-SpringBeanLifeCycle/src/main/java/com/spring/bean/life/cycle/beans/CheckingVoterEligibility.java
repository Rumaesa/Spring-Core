package com.spring.bean.life.cycle.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component("checkingVoterEligibility")
@PropertySource(value = "com/spring/bean/life/cycle/commons/votersInformation.properties")
public class CheckingVoterEligibility {

	
	@Value("${voter.id}")
	private Integer voterId;
	@Value("${voter.name}")
	private String voterName;
	@Value("${voter.age}")
	private Integer voterAge;
	
	private Date validatedOn;
	
	@PostConstruct
	public void validation() {
		System.out.println("CheckingVoterEligibility.validation()");
		validatedOn = new Date();
		if(voterName==null || voterAge<=0) {
			throw new IllegalArgumentException("Voter Information is Invalid");
		}
	}
	
	
	
	public CheckingVoterEligibility() {
		System.out.println("CheckingVoterEligibility:: 0 - Parameter Constructor");
	}



	public String checkingEligibility() {
		if(voterAge<18)
			return voterName+" you are not eligible for voting, Validated on "+validatedOn;
		else
			return voterName+" you are eligible for voting, Validated on "+validatedOn;
		
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("CheckingVoterEligibility.destroy()");
		voterName=null;
		voterAge=null;
		voterId=null;
		validatedOn=null;
	}
}
