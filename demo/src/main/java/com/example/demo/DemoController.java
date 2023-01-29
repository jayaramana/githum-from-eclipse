package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/ganapathy")
	public String hello() {
		return "Ohm Sree Maha Ganathipathiye Namaha !!!!";
	
	}
	
	@GetMapping("/muruga")
	public String hellomuruga() {
		int x = 0;

		try {
			x = 100/1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Ohm Sree Muruga Potri !!!!"+x;
	
	}
	
	@GetMapping("/sivam")
	public String hellosivam() {
		return "Ohm Namasivaya !!!!";
	
	}

}
