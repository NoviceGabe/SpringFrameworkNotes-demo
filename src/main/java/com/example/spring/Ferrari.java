package com.example.spring;

public class Ferrari implements Car  {
	private String name;
	
	public Ferrari() {
		System.out.println("No-arg constructor");
	}
	
	@Override
	public void start() {
		System.out.println("Ferrari - start()");
	}

	@Override
	public void accelerate() {
		System.out.println("Ferrari - accelerate()");
	}

	@Override
	public void stop() {
		System.out.println("Ferrari - stop()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	

}
