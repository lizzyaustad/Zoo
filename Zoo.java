import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.FileReader;
import java.util.Scanner;


public class Zoo {

	public static void main(String[] args) {

		Zoo z = new Zoo();
		// Create the Zoo Array
		Animal[] theZoo = z.create();
		// Print Zoo array

		z.printIt(theZoo, System.out);
		// At the beginning of the lab, you should understand down
		// to here
		//the next few lines will be explained later in the lab
		String fileName = "outTest.dat";

		File fi = new File(fileName);
		PrintStream fs = null;
		// Need more code here
		try {
		    fs = new PrintStream(fi);
		}
		catch (FileNotFoundException ex) {
		    System.out.println(ex);
		    System.exit(1);
		}

		// Write Zoo to a file
		
		z.printIt(theZoo, fs);
		if (fs != null)
			fs.close();
		// read Zoo from the file
		Animal[] theZoo2 = z.readFile("outTest.dat");
		// print the Zoo again
		//z.printIt(theZoo2, System.out);
		String fileName2 = "outTest2.dat";

		File fi2 = new File(fileName2);
		PrintStream fs2 = null;
		try {
		    fs2 = new PrintStream(fi2);
		}
		catch (FileNotFoundException ex) {
		    System.out.println(ex);
		    System.exit(1);
		}

		// Write Zoo to another file
		z.printIt(theZoo2, fs2);
		if (fs2 != null)
		    fs2.close();
	

	}


	private Animal[] readFile(String string) {
	    Scanner sc = null;
	    try {
		sc = new Scanner(new FileReader(string));
	    }
	    catch (FileNotFoundException ex) {
		System.out.println(ex);
		System.exit(1);
	    }
	    Animal[] newZoo = new Animal[sc.nextInt()];
	    for (int i=0; i<newZoo.length; i++) {
		
		String animal=sc.next();
		if (animal.equals("Cat")) {
		    Cat cat = new Cat(sc);
		    newZoo[i]=cat;
		}
		if (animal.equals("Feline")) {
		    Feline f = new Feline(sc);
		    newZoo[i]=f;
		}
		if (animal.equals("TopAnimal")) {
		    Animal a = new Animal(sc);
		    newZoo[i]=a;
		}
		if (animal.equals("Canine")) {
		    Canine c = new Canine(sc);
		    newZoo[i]=c;
		}
		if (animal.equals("Dog")) {
		    Dog d = new Dog(sc);
		    newZoo[i]=d;
		}
		if (animal.equals("Hippopotamus")) {
		    Hippo h = new Hippo(sc);
		    newZoo[i]=h;
		}
		if (animal.equals("Tiger")) {
		    Tiger t = new Tiger(sc);
		    newZoo[i]=t;
		}
		if (animal.equals("Wolf")) {
		    Wolf w = new Wolf(sc);
		    newZoo[i]=w;
		}
	    }
	    return newZoo;
	}

	// step 1 modify this method
	public Animal[] create() {

		Scanner kb = new Scanner(System.in);

		Cat cat = new Cat(kb);
		Feline f = new Feline(kb);

		Animal a = new Animal(kb);

		Canine c = new Canine(kb);
		
		Dog d = new Dog(kb);
		Hippo h = new Hippo(kb);

		Tiger t = new Tiger(kb);

		Wolf w = new Wolf(kb);


		System.out.println(cat.myTypeLabel());
		System.out.println(f.myTypeLabel());
		System.out.println(a.myTypeLabel());
		System.out.println(c.myTypeLabel());
		System.out.println(d.myTypeLabel());
		System.out.println(h.myTypeLabel());
		System.out.println(t.myTypeLabel());
		System.out.println(w.myTypeLabel());

		System.out.println();
		System.out.println();

		Animal[] animals = new Animal[8];
		animals[0] = cat;
		animals[1] = f;
		animals[2] = a;
	       	animals[3] = c;
		animals[4] = d;
		animals[5] = h;
		animals[6] = t;
	       	animals[7] = w;

		return animals;
	}


	private void printIt(Animal[] animals,PrintStream pw) {
		if (pw == null || animals == null)
			return;
		pw.println(animals.length);
		for (int i=0; i<animals.length;i++) {
			animals[i].printMe(pw);
		}
	}





}


