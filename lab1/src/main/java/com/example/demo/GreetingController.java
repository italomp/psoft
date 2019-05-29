package com.example.demo;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(name = "name", defaultValue = "World")
			String name) {
		return new Greeting(name);
	}
	
	@RequestMapping("/server_time")
	public LocalTime serverTime() {
		LocalTime time = LocalTime.of(LocalTime.now().getHour(), 
				LocalTime.now().getMinute(),
				LocalTime.now().getSecond());
		return time;
	}
}
