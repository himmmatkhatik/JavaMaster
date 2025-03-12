package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String name;
	private int id;
	
	@Autowired
	@Qualifier("auth")
	private Author a;
	
	public Employee() 
	{
		System.out.println("Default constructor created");	
	}
	
	
	public Employee(Author a) {
		super();
		this.a = a;
	}
	
	public Employee(int id, Author a) {
		super();
		this.id = id;
		this.a = a;
	}

	
	
	public Employee(String name, int id, Author a) {
		super();
		this.name = name;
		this.id = id;
		this.a = a;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Author getA() {
		return a;
	}


	public void setA(Author a) {
		this.a = a;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	public void printHello()
	{
		System.out.println(a.hello());
	}
	
}
