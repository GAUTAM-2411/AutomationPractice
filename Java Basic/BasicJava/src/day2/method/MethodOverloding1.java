package day2.method;
class Multiply {
	
	Multiply(){
		System.out.println("Zero-para cons..");
	}
	void mul(int a, int b) {
		System.out.println("Sum of two=" + (a * b));
	}

	void mul(int a, int b, int c) {
		System.out.println("Sum of three=" + (a * b * c));
	}
}
public class MethodOverloding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply m = new Multiply();
		m.mul(6, 10);
		m.mul(10, 6, 5);
	}

}
