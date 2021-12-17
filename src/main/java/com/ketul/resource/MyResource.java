package com.ketul.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.annotation.MyService;

@RestController
public class MyResource {

	@Autowired
	MyService myService;
	
	@GetMapping("/")
	public List<String> getMyAnnotationValueList() {
		return myService.getMyAnnotationValue();
	}
}
