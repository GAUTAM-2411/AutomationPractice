package Assignment3;
class Reverse() {
	
	int num=123,rev=0,rem=0;
	while(num!=0) {
		rem=num%10;//123%10=3 ---> 12%10=2  ----> 1%10=1
		rev=rev*10+rem;//10*0+3=3 --->3*10+2=32 ---->32*10+1=321
		num=num/10;//123/10=12 ---->12/10=1  -->1/10=0
	}
	System.out.println("Reverse Number: "+rev);
	System.out.println("Reverse Number using method: "+getReverseNumber(12345));
	System.out.println(getPalindromeNumber(121));
	System.out.println(getPalindromeNumber(123));
	}

class  palindrome extends Reverse(int num) { 
	/**
	 * rem=num%10
	 * rev=rem+rev*20
	 * num=num/10
	 */
	System.out.println("Check palindrome for number: "+num);
	int rev=0,rem,temp=num;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(temp==rev) {
		return true;
	}
	return false;	
}
public static int getReverseNumber(int num) {
	/**
	 * rem=num%10
	 * rev=rem+rev*20
	 * num=num/10
	 */
	int rev=0,rem;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;		
}

public void getLeapYear(int num) {
int year = 2028;
if(((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0)) {
System.out.println("LEAP YEAR");
}
else {
System.out.println("COMMON YEAR OR NON LEAP YEAR");

}
System.out.println("given year is leap year or not: " +CheckLeapYear(2020));
System.out.println("given year is leap year or not: " +CheckLeapYear(2024));



}
static boolean CheckLeapYear(int year) {
if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
    System.out.println ( "LEAP YEAR" );
    return true;
}
else {
	return false;
}
}

}


public class ReversePalindromeLeapYear {

	public static void main(String[] args) {
		
	}
}
			