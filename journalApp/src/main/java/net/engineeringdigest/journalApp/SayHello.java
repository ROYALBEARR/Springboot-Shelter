package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
	
	@GetMapping("hello")
	public String sayIt() {
		return "Hello ji";
	}
}
