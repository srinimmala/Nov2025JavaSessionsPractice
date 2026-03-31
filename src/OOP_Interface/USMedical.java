package OOP_Interface;

public interface USMedical extends WHO {

	int min_fee = 10;
	// interface vars are static and final in nature by default.
	// access them using Interface name

	// can not have method body (NS)- only method declaration
	// only method prototype
	// No business logic in interface methods
	// Abstract Method -- a method has no method body, no buss logic
	// can not create the object of Interface
	// can not have const... of the interface

	public void pediaServices();

	public void cardioServices();

	public void physioServices();

	public void emergencyService();

	// two major changes from JDK 1.8:
	// 1. static method with the method body:
	public static void billing() {
		System.out.println("USM -- billing");
	}

	// 2. default method with the method body (non static):
	// default keyword -- is only for interface
	default void training() {
		System.out.println("USM -- training");
	}

} 
