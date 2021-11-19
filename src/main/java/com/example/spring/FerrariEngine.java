package com.example.spring;

public class FerrariEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Ferrari engine start");

	}

	@Override
	public void rev() {
		System.out.println("Vroom vroooomm..");

	}

	@Override
	public void stop() {
		System.out.println("Ferrari engine stop");

	}

}
