package com.dependency.lookup.sbeans;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cricketBat")
@Lazy(true)
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat.CricketBat() :: 0 - Param Constructor");
	}

	public int scoreRun() {
		return new Random().nextInt(200);
	}
}
