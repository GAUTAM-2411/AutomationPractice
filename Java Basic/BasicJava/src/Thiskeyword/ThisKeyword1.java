package Thiskeyword;

public class ThisKeyword1 {
	int age,empId;
	void display(int age) {
		System.out.println(age);//JVM will search age in display body first and print local variable value
		System.out.println(empId);//JVM will search empId in display body first dn search in class body and print global variable empId
		System.out.println(this.age);//JVM will search age directly in class body and print global variable age
	}

	
		
		public static void main(String[] args) {
			ThisKeyword1 t1=new ThisKeyword1();
			t1.display(25);
		}

	}


