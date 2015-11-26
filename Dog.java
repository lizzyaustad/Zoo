import java.io.PrintStream;
import java.util.Scanner;


public class Dog extends Canine {

	public Dog(Scanner kb) {
		super(kb);		
	}

	public String myTypeLabel() {
		return "Dog";
	}	
}

