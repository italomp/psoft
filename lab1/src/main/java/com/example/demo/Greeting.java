package com.example.demo;

import java.time.LocalTime;

public class Greeting {
	private String name;
	private String saudacao;
	
	public Greeting(String name) {
		this.name = name;
		this.saudacao = "Hello, " + this.name + " " + definirSaudacao();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSaudacao() {
		return this.saudacao;
	}
	
	public String definirSaudacao() {
		LocalTime comecoDia = LocalTime.of(0, 0);
		LocalTime comecoTarde = LocalTime.of(12, 0);
		LocalTime comecoNoite = LocalTime.of(18, 0);
		
		if(LocalTime.now().compareTo(comecoDia) >= 0 &&
				LocalTime.now().compareTo(comecoTarde) < 0) {
			return "bom dia!";
		}
		else if(LocalTime.now().compareTo(comecoTarde) >= 0 &&
				LocalTime.now().compareTo(comecoNoite) < 0) {
			return "boa tarde!";
		}
		else {
			return "boan noite!";
		}
	}

}
