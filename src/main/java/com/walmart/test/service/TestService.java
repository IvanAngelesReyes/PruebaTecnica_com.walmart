package com.walmart.test.service;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;

import com.walmart.test.controller.TestController;

public class TestService 
{
	
	public JSONObject comparaArrs(String [] arr1, String[] arr2)
	{
		
		//TestController resTC = new TestController();
		JSONObject json = new JSONObject();
		
		if (arr1.length>=arr2.length) 
		{
			int contRep=0;
			for(int i=0; i<arr2.length; i++)
			{
				for(int j=0; j<arr1.length; j++)
				{
					if(arr2[i].equals(arr1[j]) )
					{
						System.out.println(arr2[i] + "=" + arr1[j]);
						contRep++;
					}
				}
				//resTC.res.setProd(arr2[i]);
				//resTC.res.setRep(contRep);
				json.put(arr2[i], contRep);
				contRep=0;
			}
			
			
		}
		
		
		return json;

	}

}
