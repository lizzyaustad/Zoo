import java.io.PrintStream;
import java.util.Scanner;

public  class Animal {

	private int weight;
	private boolean carnivore;
	private String name;
	private String location;

	public Animal() {

	}

	public Animal(Scanner kb) {
		this.weight = kb.nextInt();
		this.carnivore = kb.nextBoolean();
		this.name = kb.next();
		this.location = kb.next();
	}

	public void printMe(PrintStream p) {
		p.println(myTypeLabel());
		printFields(p);
	}

	//step 2 modify this method and its overrides
	public void printFields(PrintStream p) {
	    p.println(weight);
	    p.println(carnivore);
	    p.println(name);
	    p.println(location);
	}

	public int getWeight() {
		return weight;
	}

	public  String myTypeLabel() {
		return "TopAnimal";
	}
}
