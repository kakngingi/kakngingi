package com.javalec.model;

public abstract class LunchMenu {
	// field
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int almond;

	// Constructor
	public LunchMenu() {
	}

	public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
		super();
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;

	}

	public abstract int calc();

}
