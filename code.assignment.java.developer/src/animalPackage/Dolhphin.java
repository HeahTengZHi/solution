package animalPackage;

public class Dolhphin extends Animal implements liveInWater {
	
	public void walk() {
		System.out.println("Dolhphin cant walk");
	}
	
	public void sing() {
		System.out.println("Dolhphin can sing");
	}
	
	@Override
	public void swim() {
		System.out.println("Dolhphin can swim");
		
	}

	@Override
	public void characteristics() {
		System.out.println("Dolhphins have grey and pink color");
	}
}
