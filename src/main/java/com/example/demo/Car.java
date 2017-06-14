package com.example.demo;

public class Car {
	private int speed;
	private String name;

	/**
	 * タイヤ.
	 */
	private int tires;

	public Car() {

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}
}
