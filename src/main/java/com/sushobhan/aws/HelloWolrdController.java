package com.sushobhan.aws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWolrdController {
	
	@Autowired
	private HelloWorldBean bean;
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello Wolrd";
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		bean.setMessage("Hello World - Changed - V2");
		return bean;
	}
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean hellowWorldPathVariable(@PathVariable String name) {
		bean.setMessage("Hello World : "+ name);
		return bean;
	}

}
