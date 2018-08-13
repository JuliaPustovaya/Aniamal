package aniaml.impl;

import aniaml.Pet;

public class Cat extends Pet {
	public Cat(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	public void sleepOnKeyBoard() {
		System.out.println("Люблю спать на клаве");
	}

	@Override
	public void sleep() {
		this.sleepOnKeyBoard();
	}

	public void eat() {
		System.out.println("love eat fish");
	}

	public void peeInTray() {
		System.out.println("Приучен к горшку");
	}
}
