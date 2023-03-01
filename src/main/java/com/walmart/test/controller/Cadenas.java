package com.walmart.test.controller;

import java.util.Arrays;

public class Cadenas 
{
	
	private String arr1[];
	private String arr2[];
	
	public Cadenas()
	{
		
	}
	
	public Cadenas(String[] arr1, String[] arr2) {
		super();
		this.arr1 = arr1;
		this.arr2 = arr2;
	}

	public String[] getArr1() {
		return arr1;
	}

	public void setArr1(String[] arr1) {
		this.arr1 = arr1;
	}

	public String[] getArr2() {
		return arr2;
	}

	public void setArr2(String[] arr2) {
		this.arr2 = arr2;
	}
	
	
	

	@Override
	public String toString() {
		return "Cadenas [arr1=" + Arrays.toString(arr1) + ", arr2=" + Arrays.toString(arr2) + "]";
	}
	
	
	

}
