package day1variable;

public class Globalvariable2 {
	static int age=25;
	static double payment=100000;
	
	char grade='a';
	boolean wonmatch=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sallary=1000l;
		System.out.println("salary is :" +sallary);
		System.out.println("age: "+Globalvariable2.age);
		System.out.println("payment: "+Globalvariable2.payment);
		Globalvariable2 g1=new Globalvariable2();
		Globalvariable2 g2=new Globalvariable2();
		System.out.println("character: "+g1.grade);
		System.out.println("result: "+g1.wonmatch);
		
		
		
		
		

	}

}
