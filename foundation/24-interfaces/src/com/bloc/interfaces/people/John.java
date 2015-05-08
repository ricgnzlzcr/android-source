package com.bloc.interfaces.people;
import com.bloc.interfaces.people.hobbies.Driver;

/************************************************
 *	ASSIGNMENT:
 *	Have John implement the Driver interface
/************************************************/

public class John extends Person implements Driver {
	public John() {
		super("John", "Smith", "Male", 1.7d, 69d, "Brown");
	}

	@Override
	public void getInCar() {
		// Blank on purpose
	}

	@Override
	public void startEngine() {
		// Blank on purpose
	}

	@Override
	public void driveFast() {
		// Blank on purpose
	}
}