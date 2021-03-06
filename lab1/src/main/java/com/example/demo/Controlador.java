package com.example.demo;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controlador{
		
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name", required = false,
			defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		
		LocalTime comecoDia = LocalTime.of(0, 0);
		LocalTime comecoTarde = LocalTime.of(12, 0);
		LocalTime comecoNoite = LocalTime.of(18, 0);
		
		if(LocalTime.now().compareTo(comecoDia) >= 0 &&
				LocalTime.now().compareTo(comecoTarde) < 0) {
			return "bomDia";
		}
		else if(LocalTime.now().compareTo(comecoTarde) >= 0 &&
				LocalTime.now().compareTo(comecoNoite) < 0) {
			return "boaTarde";
		}
		else {
			return "boaNoite";
		}
	}
	
	@GetMapping("/time")
	public String time(String name, Model model) {
		LocalTime hora = LocalTime.of(LocalTime.now().getHour(), 
				LocalTime.now().getMinute(),
				LocalTime.now().getSecond());
		model.addAttribute("hora", hora);
		return "time";
	}
	
}