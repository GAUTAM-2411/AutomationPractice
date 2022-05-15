package day1variable;

public class Globalvarible5 {
		//Global Variable
		static int empId=123;//static global variable or class variable
		
		public static void main(String[] args) {
			int age=30,empId=800;//local Variable
			System.out.println("Local Variable, Age: "+age);//
			age=45;
			System.out.println("Updated, Local Variable, Age: "+age);//
			System.out.println("Local Variable, EmpID: "+empId);//800
			System.out.println("Standard way to access SGV, EmpID: "+GlobalVariable5.empId);//123
			empId=456;//updating local variable value
			System.out.println("updated, Local Variable,, EmpID: "+empId);//456
			GlobalVariable5.empId=987;//updating Global static variable value
			System.out.println("updated, Standard way to access SGV, EmpID: "+GlobalVariable5.empId);//	
		}
	

	}


