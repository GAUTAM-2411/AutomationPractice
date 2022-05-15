package AssignmentPracticeProgram;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rem=temp%10;
		// sum=sum+rem*rem*rem;
		// temp=tem/10
		System.out.println(test(153));

	}

	static boolean test(int num) {
		int sum=0;
		if (num == sum) {
			return true;
		} else {
			return false;
		}

	}

	static boolean isArmStrong(int num) {

		int temp, rem = 0;
		double sum = 0;
		temp = num;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;
		}
		if (num == sum) {
			return true;
		} else {
			return false;
		}
	}

}
