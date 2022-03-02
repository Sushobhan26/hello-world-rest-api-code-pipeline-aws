package com.sushobhan.aws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWolrdController {
	
	@Autowired
	private HelloWorldBean helloWorld;
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World V3";
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		helloWorld.setMessage("Hello World - Changed - V3");
		return helloWorld;
	}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean hellowWorldPathVariable(@PathVariable String name) {
		helloWorld.setMessage("Hello World : "+ name);
		return helloWorld;
	}

}
