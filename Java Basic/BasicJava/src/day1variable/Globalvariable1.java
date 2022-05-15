package day1variable;

public class Globalvariable1 {
		// TODO Auto-generated method stub
	    static int empID=123;           //global variable
		static double salary=45000.25;  //global variable
		static int age = 20;
		public static void main(String[] args) {
			int age= 30; //local variaable
			
		System.out.println("salary is :" +salary);
		System.out.println("age is :" +age);
		System.out.println("sgv empID,empID :" +empID);
		System.out.println("sgv age is :" + Globalvariable1.age);
		System.out.println("nsgv; ");
		
		
	}



	}


