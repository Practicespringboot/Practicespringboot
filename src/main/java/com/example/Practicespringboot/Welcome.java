package com.example.Practicespringboot;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/welcome")
	public String getmsg() {
		return "Hi man, Welcome to Spring boot Practice sessions";
	}

	@GetMapping("/date")
	public LocalDateTime getdate() {
		LocalDateTime dt = LocalDateTime.now();
		return dt;

	}

}
