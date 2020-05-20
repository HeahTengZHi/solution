package animalPackage;

public class Fishes extends Animal implements liveInWater{

	public void swim() {
		System.out.println("Fish can swim");
	}
	
	public void characteristics() {
		System.out.println("Fish has fin");
	}
	
	public void sing() {
		System.out.println("Fish cant sing");
	}
	
	public void walk() {
		System.out.println("Fish cant walk");
	}
}
