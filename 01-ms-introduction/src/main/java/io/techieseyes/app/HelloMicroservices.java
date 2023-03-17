package io.techieseyes.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloMicroservices {

	@GetMapping(value = "/hello")
	public String hello() {
		return "{\"msg\":\"Hello Microservices!!\"}";
	}
}
