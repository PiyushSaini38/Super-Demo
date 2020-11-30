
class ParameterizedConstructor {

	int x, y;

	public ParameterizedConstructor(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void add() {
		System.out.println("Addition of x and y is: " + (x + y));
	}

}

public class SuperParameterizedConstructor extends ParameterizedConstructor {

	public SuperParameterizedConstructor() {
		super(10, 20);
		System.out.println("Inside SuperParemeterizedConstructor class");
	}

	public static void main(String[] args) {
		SuperParameterizedConstructor sp = new SuperParameterizedConstructor();
		sp.add();

	}

}
