package Inheritance;

public class Inhetitance11 {
	public static void main(String[] args) {
		Company g1 = new Company();
		g1.rutuja();
		g1.bmw();
		Company g2 = new Company(10, 20);
		Employee1 g3 = new Employee1();
		g3.rutuja();

	}

}

//parent class
class Company1 {
	// global variable
	int companyage;

	// method with method overloading use of this keyword
	void rutuja() {
		System.out.println("i am name of rutuja");

	}

	void bmw() {
		System.out.println("i am class of company car bmw");
	}

	void bmw(int companyage) {

		System.out.println("i am name of bmw");
		System.out.println("gv name companyage " + this.companyage);

	}

	// constructor with overloading and use of this()
	Company1() {

		System.out.println("zero parameter constructor");

	}

	Company1(int g, int r) {
		this();
		System.out.println("int int parameter constuctor");
	}

//child class of Company
	class Employee extends Company1 {
		// global variable name as Company name variable
		int companyage = 10;
		// constructor with overloading and use of this() & super()

		Employee() {
			System.out.println("i am Employee1");

		}

		Employee(int a, int b) {
			super();
		}

		// method with method overloading use of this & super keyword
		void rutuja() {
			System.out.println("gv in class");
		}

		void rutuja(int g, double k) {

		}
	}
}
