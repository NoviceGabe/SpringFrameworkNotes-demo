package com.example.spring;

public class GenericEngine implements Engine {
	
	public GenericEngine() {
		System.out.println("GenericEngine No-arg constructor");
	}

	@Override
	public void start() {
		System.out.println("Generic engine start");

	}

	@Override
	public void rev() {
		System.out.println("Vroom vroooomm..");

	}

	@Override
	public void stop() {
		System.out.println("Generic engine stop");

	}
}
