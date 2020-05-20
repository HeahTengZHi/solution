package animalPackage;

public class Frog extends Animal implements liveInWater{

	public void swim() {
		System.out.println("Frog swimming");
	}
	
	public void walk() {
		System.out.println("Frog cant walk");
	}
	
	public void sing() {
		System.out.println("Frog singing");
	}

	@Override
	public void characteristics() {
		System.out.println("Frog can lives both in water and land");
	}
}
