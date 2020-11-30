//Java program to demonstrate super keyword
// access parent class method using super

class Demo {
	void display() {
		System.out.println("Method in Parent Class (Demo)");
	}
}

public class SuperDemo extends Demo {

	void display() {
		super.display(); // calling method in parent class
							// using super.display()
		System.out.println("Method in Child Class (SuperDemo) ");
	}

	public static void main(String[] args) {
		SuperDemo d = new SuperDemo();
		d.display();

	}

}
