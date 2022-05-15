package day2.method;

public class Method1 {
	/*
	 *accessmodifire:
	 *non-accessmodifire:
	 *return type:
	 *methodName:
	 *argument/parameter:
	 *return value:
	 */ 


	public static void printDetails(int age,int salary) { 
		System.out.println("Hi,good morning everyone");
		System.out.println("staying in pune");
		System.out.println("I am "+age+"yrs old");
		System.out.println("My salary is:"+salary);
	}
		public static void main(String[] args) {
			System.out.println("**1**");
			printDetails(25,45000);
			System.out.println("**2**");
			Method1.printDetails(20,75000);
			System.out.println("**3**");
			printDetails(30,55000);
			System.out.println("**4**");
			printDetails(28,33000);
			System.out.println("**5**");
			printDetails(35,40000);
			System.out.println("**6**");
			Method1.printDetails(55,65000);
			System.out.println("**7**");
			printDetails(24,43000);
			System.out.println("**8**");
			printDetails(22,50000);
			System.out.println("**9**");
			Method1.printDetails(43,80000);
			System.out.println("**10**");
			printDetails(27,70000);
		}
		

	}


