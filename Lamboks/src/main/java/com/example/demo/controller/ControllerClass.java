package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ModelClass;

@RestController
public class ControllerClass {

	@GetMapping("/hello")
	public String method() {
		return "hello-world-hello-two-two";
	}
	ArrayList<ModelClass> al=new ArrayList<>();
	
	@GetMapping("/data")
	public void method2()
	{
		ModelClass m=new ModelClass();
		m.setName("kumar");
		al.add(m);
		
	}
	@GetMapping("/dataout")
	public String method3()
	{
	 return al.get(0).getName();
		
	}

}
