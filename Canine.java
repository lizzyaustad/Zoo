import java.io.PrintStream;
import java.util.Scanner;


public class Canine extends Animal {

    private String[] friends;

    public Canine() {
	
    }

    public Canine(Scanner kb) {
	super(kb);
       	friends = new String[kb.nextInt()];
	for (int i=0; i<friends.length; i++)
	    friends[i] = kb.next();
    }

    public void printMe (PrintStream p) {
	p.println(myTypeLabel());
	printThefields(p);
    }

    public void printThefields (PrintStream p ) {
	printFields(p);
	p.println(friends.length);
	for (int i =0; i<friends.length; i++){
	    p.print(friends[i]+" ");
	} p.println();
       
    }

    public String myTypeLabel() {
	return "Canine";
    }
	
	
}
