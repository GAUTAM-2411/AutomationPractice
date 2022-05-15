package AssignmentPracticeProgram;

public class Primenumber {
      //0&1 are not prime number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkprimenumber(3);
		checkprimenumber(8);
	}
	static void checkprimenumber(int num) {
		int check =0 ;
		int check1 =1;
		if(num==0||num==1) {
			System.out.println(num+"is not prime number");
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num+ " is not a prime number");
					check=1;
					break;
				}
				}if(check==0) {
					System.out.println(num+ "  num is a prime number");
					
	
				}
			}
		}
	}


