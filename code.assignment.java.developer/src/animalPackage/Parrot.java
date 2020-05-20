package animalPackage;


public class Parrot extends Bird{
	private static Dog dog=null;
	private static Cat cat=null;
	private static Chicken chicken=null;
	public void fly() {
		System.out.println("Parrot flying");
		
	}
	
	public void walk() {
		System.out.println("Parrot walking");
	}
	
	public void sing(String animal) {
		switch(animal) {
		case "dog":
			dog=new Dog();
			dog.sing();
			break;
			
		case "cat":
			cat=new Cat();
			cat.sing();
			break;
			
		case "rooster":
			chicken=new Chicken();
			Chicken.Rooster rooster=chicken.new Rooster();
			rooster.sing();
			break;
		}
	}

	
}
