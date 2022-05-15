package AssignmentPracticeProgram;

public class LeapYear {

	public static void main(String[] args) {
       int year = 2020;
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
