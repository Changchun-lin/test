package com.ccclin.mathtest;

public enum NumEnum {
	Fizz3("Fizz3","3"),
	Buzz5("Buzz5","5"),
	Buzz35("Buzz35","15"),
	;
	
	private String name;
	
	private String value;
	
	private NumEnum(String name,String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
}
