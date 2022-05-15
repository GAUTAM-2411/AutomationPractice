package ThisStatement;

public class ThisStatement1 {
	ThisStatement1(){
		System.out.println("I am zero-param");
	}
	ThisStatement1(int num){
		this(45l);
		System.out.println("I am int-param");
		System.out.println(num);
	}
	ThisStatement1(double num){
		this(25);
		System.out.println("I am double-param");
		System.out.println(num);
	}
	ThisStatement1(long num){
		this('a');
		System.out.println("I am long-param");
		System.out.println(num);
	}
	ThisStatement1(char num){
		System.out.println("I am char-param");
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ThisStatement1 t1=new ThisStatement1(25.6);
		}

	}


