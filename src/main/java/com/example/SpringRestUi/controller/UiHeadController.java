package com.example.SpringRestUi.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringRestUi.Modals.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Controller
public class UiHeadController {
	
	@RequestMapping(value="sendData",method=RequestMethod.POST)
	public ModelAndView sendData(@ModelAttribute("st")Student student) throws JsonProcessingException 
	{
		ObjectMapper mapper=new ObjectMapper();
		String jsonObject=mapper.writeValueAsString(student);
		RestTemplate restTemplate=new RestTemplate();
		HttpEntity<String> ht1=new HttpEntity<>(jsonObject);
		ResponseEntity<String> entity=restTemplate.exchange("http://localhost:8087/doSave",HttpMethod.POST,ht1,String.class);
		String res=entity.getBody();
		System.out.println(res);
		return new ModelAndView("Home","msg",res);
		
		
		
	}
	
	

}
