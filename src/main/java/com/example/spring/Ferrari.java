package com.example.spring;

public class Ferrari implements Car  {
	private String name;
	private Engine engine; // define a property for the dependency
	
	public Ferrari() {
		System.out.println("No-arg constructor");
	}
	// define constructor for dependency injection
	public Ferrari(Engine engine) {
		System.out.println("setting engine via constructor");
		this.engine = engine;
	}
	
	@Override
	public void start() {
		engine.start();
	}

	@Override
	public void accelerate() {
		engine.rev();

	}

	@Override
	public void stop() {
		engine.stop();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name");
		this.name = name;
	}
	
}
