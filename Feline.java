import java.io.PrintStream;
import java.util.Scanner;


public class Feline extends Animal {

	private boolean isFriendly;

	public Feline() {

	}

	public Feline(Scanner kb) {
		super(kb);
		isFriendly = kb.nextBoolean();

	}

    public void printMe (PrintStream p) {
	p.println(myTypeLabel());
	printThefields(p);
    }

    public void printThefields (PrintStream p ) {
	
	printFields(p);
	p.println(isFriendly);
    }
	public String myTypeLabel() {
		return "Feline";
	}

}