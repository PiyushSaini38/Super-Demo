
// Java program to demonstrate the use of super
// to invoke the parent class constructor

class Parent {

	public Parent() {
		System.out.println("Constructor of Parent class");
	}

}

public class SuperConstructorDemo extends Parent {

	public SuperConstructorDemo() {
		super();
		System.out.println("Constructor of Child class");

	}

	public static void main(String[] args) {
		SuperConstructorDemo sc = new SuperConstructorDemo();
	}

}
