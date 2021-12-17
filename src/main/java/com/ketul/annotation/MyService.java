package com.ketul.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
public class MyService {
	
	@Autowired
	private MyAnnotationService myAnnotationService;

	public List<String> getMyAnnotationValue() {
		
		List<String> list = new ArrayList<String>();
		
		Class runTimeClass = myAnnotationService.getClass();
		
		MyAnnotation myAnnotation = (MyAnnotation) runTimeClass.getAnnotation(MyAnnotation.class);
		
		list.add("" + myAnnotation.myValue());
		list.add(myAnnotation.name());
		list.add(myAnnotation.city());
		
		return list;
	}
}
