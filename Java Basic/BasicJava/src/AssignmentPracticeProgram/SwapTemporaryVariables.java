package AssignmentPracticeProgram;

public class SwapTemporaryVariables {

	public static void main(String[] args) {
     float FirstNum = 25L;
     float SecondNum = 30f;
       System.out.println("Before Swap is: ");
       System.out.println("FirstNumber is: "+FirstNum);
       System.out.println("SecondNumber is: "+SecondNum);
      
    float temporary = FirstNum;
    FirstNum = SecondNum;
    SecondNum = temporary;
    System.out.println("After Swap is: ");
    System.out.println("FirstNumber is: "+FirstNum);
    System.out.println("SecondNumber is: "+SecondNum);
   
	}

}

/*
 output:
 Before Swap is: 
FirstNumber is: 25.0
SecondNumber is: 30.0
After Swap is: 
FirstNumber is: 30.0
SecondNumber is: 25.0

 */