package num;

import java.util.ArrayList;

public class Guest {

	private String name;
	
	private String nightGreeting;
	
	private String morningGreeting;
	
	Guest(String N){
		
		this.name= N;
		
		this.morningGreeting = "Good Morning";
		
		this.nightGreeting = "Good Evening";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNightGreeting() {
		return nightGreeting;
	}

	public void setNightGreeting(String nightGreeting) {
		this.nightGreeting = nightGreeting;
	}

	public String getMorningGreeting() {
		return morningGreeting;
	}

	public void setMorningGreeting(String morningGreeting) {
		this.morningGreeting = morningGreeting;
	}
	
	public String greetNight() {
		return("Good Evening "+this.name);
		}
	
	public String greetMorning() {
		return("Good Morning "+this.name);
		
	}
	
	//main in class was here origionally

	
	
}
