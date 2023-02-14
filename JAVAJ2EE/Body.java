package com.man;

import org.springframework.beans.factory.annotation.Autowired;

public class Body {
	
	private Heart heart;

	public Heart getHeart() {
		return heart;
	}
@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
		
	}
public void bodyMethod() {
	heart.heartMethod();
	
}
	
}
