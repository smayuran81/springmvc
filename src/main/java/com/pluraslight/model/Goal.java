package com.pluraslight.model;

import org.hibernate.validator.constraints.Range;


public class Goal {
	
	
	@Range(min=0, max=120)
	private int minutes;
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

}
