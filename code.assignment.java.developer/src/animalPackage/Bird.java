package animalPackage;

public class Bird extends Animal implements wingInterface{
	public void fly() {
		System.out.println("Most of the bird can fly");
	}
	
	public void walk() {
		System.out.println("Bird can walk");
	}
	
	public void sing() {
		System.out.println("Bird can sing");
	}
}
