package com.example;

import org.springframework.beans.factory.annotation.Value;

public class Author {

	@Value("${auth_name}")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}
	
	public String hello()
	{
		System.out.println(this.toString());
		return "Hello Himmat !";
	}
}
