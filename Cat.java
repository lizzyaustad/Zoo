import java.io.PrintStream;
import java.util.Scanner;


public class Cat extends Feline {

	public Cat(Scanner kb) {
		super(kb);
	}

	public String myTypeLabel() {
		return "Cat";
	}
}
