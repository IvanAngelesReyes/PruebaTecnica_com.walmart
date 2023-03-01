package com.walmart.test.controller;


import org.springframework.http.MediaType;

import java.util.Iterator;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.test.service.TestService;

import org.json.simple.JSONObject;

@RestController
@RequestMapping("/api")
public class TestController 
{

	
	@PostMapping(path="/searchArray", consumes = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject cadenas2(@RequestBody Cadenas cads) 
	{
		
		if(cads.getArr1()==null || cads.getArr2()==null)
		{
			System.out.println("Cadenas nulas");
		}else
		{
			if (cadenaVacia(cads.getArr1())==true || cadenaVacia(cads.getArr2())==true) 
			{
				System.out.println("Cadenas vacias");
			}else
			{
				//new TestService().comparaArrs(cads.getArr1(), cads.getArr2());
			}
		}
		
		return new TestService().comparaArrs(cads.getArr1(), cads.getArr2());
	}
	
	public boolean cadenaVacia(String [] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i].isEmpty()) 
			{
				return true;
			}
		}
		return false;
	}
}
