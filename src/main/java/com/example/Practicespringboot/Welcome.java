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

	@GetMapping("/length")
	public String getlength() {
		String s1 = "sreedhar1994";
		return "The length of String is --" + s1.length();
	}

	@GetMapping("/casesensitive")
	public String getupperandlowercase() {
		String s1 = "SREEdharREddy";
		return "The uppercase and lowercase in string are--" + s1.toUpperCase() + s1.toLowerCase();
	}

	@GetMapping("/position")
	public String getposition() {
		String s1 = "I AM SPRINGBOOT LEARNER";
		return "The character at position 6 :  " + s1.charAt(6);
	}
	@GetMapping("/user")
	public String user() {
		String name = "SREEDHAR";
		String pan = "ABCDE1234F";
		String dob= "06-06-1995";
		
		return "The password of a file is " + name.substring(0,2 ) +  pan.substring(0,2 ) + dob.substring(6,10);
		
		
	}
}
