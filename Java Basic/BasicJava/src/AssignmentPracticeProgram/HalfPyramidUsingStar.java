package AssignmentPracticeProgram;

public class HalfPyramidUsingStar {
	public static void main(String[] args) {
	
	System.out.println("******nested for loop half pyramid using star********");
		for(int i=0;i<5;i++) {
	       for(int j=0;j<=i;j++) { 
	System.out.print(" * ");
		}
     System.out.println();	    
		
	}
		System.out.println("******nested for loop half inverted pyramid using star********");
		for(int i=0;i<5;i++) {
	       for(int j=5;j>i;j--) { 
	       System.out.print(" * ");
	}
	       System.out.println();	    
			  
		}
		System.out.println("******nested for loop half pyramid using alphabet********");
		char last='E',alphabet='A';
		for(int i=1;i<=(last-'A'+1);i++) {
	       for(int j=1;j<=i;j++) { 
	System.out.print(alphabet +"  ");
		}
	       alphabet++;
     System.out.println();	    
		
	}
		System.out.println("******nested for loop half inverted pyramid using alphabet********");
		for(int i=0;i<=(last-'A'+1);i++) {
	       for(int j=5;j>i;j--) { 
	       System.out.print("  ");
	}
	       System.out.println();	    
			  
		}
		System.out.println("******nested for loop half pyramid using number********");
		for(int i=1;i<6;i++) {
	       for(int j=1;j<=i;j++) { 
	System.out.print(j+"  ");
		}
     System.out.println();	    
		
	}
		System.out.println("******nested for loop half inverted pyramid using number********");
		for(int i=5;i>=1;i--) {
	       for(int j=1;j<=i;j++) { 
	       System.out.print(j+ "  ");
	}
	       System.out.println();	    
	}
	}	
}
	
		

