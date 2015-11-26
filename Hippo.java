import java.io.PrintStream;
import java.util.Scanner;


public class Hippo extends Animal {

	private String skinColor;

	public Hippo(Scanner kb) {
		super(kb);
		skinColor = kb.next();
	}

    public void printMe (PrintStream p) {
	p.println(myTypeLabel());
	printThefields(p);
    }

    public void printThefields (PrintStream p ){
	printFields(p);
	p.println(skinColor);
    
    }

	public String myTypeLabel() {
		return "Hippopotamus";
	}

}