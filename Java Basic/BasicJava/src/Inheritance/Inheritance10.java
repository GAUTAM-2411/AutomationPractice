package Inheritance;

public class Inheritance10 {

	public static void main(String[] args) {
		Company g1 = new Company();
		System.out.println("****1****");
		g1.rutuja();
		System.out.println("****2****");
		g1.bmw();
		System.out.println("****3****");
		Company g2 = new Company(10, 20);
		System.out.println("****4****");
		g2.bmw(20);
		System.out.println("****5****");
		Employee g3 = new Employee(10,15);
		System.out.println("****6****");
		g3.rutuja();
		System.out.println("****7****");
		g3.bmw();
		
	}
}


//parent class
class Company {
	// global variable
	int companyage =11;

	// method with method overloading use of this keyword
	void rutuja() {
		System.out.println("i am name of rutuja");

	}

	void bmw() {
		System.out.println("i am class of company car bmw in parent");
	}

	void bmw(int companyage) {
    
		System.out.println("i am name of bmw "+companyage);
		System.out.println("gv name companyage " + this.companyage);

	}


	// constructor with overloading and use of this()
	Company() {
        this(10,20);
		System.out.println("zero parameter constructor");

	}

	Company(int g, int r) {
		//this();
		System.out.println("int int parameter constuctor");
	}
}

//child class of Company
	class Employee extends Company {
		// global variable name as Company name variable
		int companyage = 10;
		// constructor with overloading and use of this() & super()

		Employee() {
			this(20,30);
			System.out.println("i am Employee1");

		}

		Employee(int a, int b) {
			super();
			System.out.println("i am Employee");
		}

		// method with method overloading use of this & super keyword
		void bmw() {
			System.out.println("i am class of company car bmw");
			super.bmw(50);
		}
		void rutuja() {
			System.out.println("gv in class " + this.companyage);
			System.out.println("gv in class " + super.companyage);

		}

		void rutuja(int g, double k) {

		}
	}

