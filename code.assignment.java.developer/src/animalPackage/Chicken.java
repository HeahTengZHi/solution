package animalPackage;

public class Chicken extends Bird{
	
	public void fly() {
		System.out.println("Chicken cannot fly");
	}
	
	public void walk() {
		System.out.println("Chicken walking");
	}
	
	public void sing() {
		System.out.println("Cluck cluck");
	}
	
	public class Rooster implements wingInterface{
		void sing() {
			System.out.println("Cock-a-doodle-doo");
		}
		public void walk() {
			System.out.println("Rooster walking");
		}
		
		 public void fly() {
			System.out.println("Rooster cannot fly");
		}
	}
	
	Rooster refRooster=new Rooster();
}
