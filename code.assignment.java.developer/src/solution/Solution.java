package solution;

import animalPackage.Animal;
import animalPackage.Bird;
import animalPackage.Butterfly;
import animalPackage.Cat;
import animalPackage.Chicken;
import animalPackage.Clownfish;
import animalPackage.Dog;
import animalPackage.Duck;
import animalPackage.Fishes;
import animalPackage.Frog;
import animalPackage.Parrot;
import animalPackage.Shark;

public class Solution {

	public static void main(String[] args) {
		Animal[] animals = new Animal[]{ new Bird(), new Duck(), 
		        new Chicken(), 
		        new Parrot(), 
		        new Fishes(), 
		        new Shark(), 
		        new Clownfish(),
		        new Frog(), 
		        new Dog(), 
		        new Butterfly(), 
		        new Cat() 
		};
		
		
		System.out.println("\nParrot\n====================");
		Parrot parrot=(Parrot) animals[3];
		parrot.sing();
		parrot.sing("dog");
		parrot.sing("cat");
		parrot.sing("rooster");
		
		
		System.out.println("\nButterfly\n====================");
		Butterfly Butterfly=(Butterfly) animals[9];
		Butterfly.fly();
		Butterfly.sing();
		Butterfly.refCaterpillar.fly();
		Butterfly.refCaterpillar.sing();
		Butterfly.refCaterpillar.walk();
		
		System.out.println("\nShark\\n====================");
		Shark shark=(Shark) animals[5];
		shark.walk();
		shark.characteristics();
	}

}
