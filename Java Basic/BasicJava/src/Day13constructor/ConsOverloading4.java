package Day13constructor;

public class ConsOverloading4 {
	ConsOverloading4() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ConsOverloading4(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ConsOverloading4(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	ConsOverloading4(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	ConsOverloading4(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsOverloading4 pc5 = new ConsOverloading4();
		ConsOverloading4 pc1 = new ConsOverloading4(12);
		ConsOverloading4 pc2 = new ConsOverloading4(13.34);
		ConsOverloading4 pc3 = new ConsOverloading4(10,13.34,45);
		ConsOverloading4 pc4 = new ConsOverloading4(13.34,23,87);
	}

}
