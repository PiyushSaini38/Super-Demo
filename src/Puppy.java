//Java program to demonstrate super keyword
// using super to access parent class variable

class Dog {
	String breed = "Rottweiler"; // String in parent class
}

public class Puppy extends Dog {
	String breed = "Pitbull"; // String in child class

	void display() {
		System.out.println("String in Dog class " + super.breed);
		// access breed variable of parent class using super.breed
	}

	public static void main(String[] args) {
		Puppy p = new Puppy();
		System.out.println("String in Puppy class " + p.breed);
		// access breed variable of Child class using object
		p.display();

	}

}
