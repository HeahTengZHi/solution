package animalPackage;

public class Butterfly extends Animal implements wingInterface{

	public void fly() {
		System.out.println("Butterfly can fly");
	}
	
	public void walk() {
		System.out.println("Butterfly cant walk");
	}
	
	public void sing() {
		System.out.println("Butterfly cant singing");
	}
	
	
	public class Caterpillar  implements wingInterface{
		public void fly() {
			System.out.println("Caterpillar cant fly");
		}
		
		public void walk() {
			System.out.println("Caterpillar can walk");
		}
		
		public void sing() {
			System.out.println("Caterpillar cant singing");
		}
	}
	
	public Caterpillar refCaterpillar=new Caterpillar();
}
