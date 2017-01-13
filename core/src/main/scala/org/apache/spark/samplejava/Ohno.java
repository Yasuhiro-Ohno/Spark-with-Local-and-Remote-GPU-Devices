package ohno;

import java.lang.String;
import java.lang.System;

public class Ohno {
	private String name;

	public Ohno ( String name ){
		this.name = name;
	}

	public void sayGreeting() {
		System.out.println("Hello, my name is " + name + ".");
	}
}
