package packageName;
import java.util.Scanner;
public class Calculator {
	 private int num1;
	    private int num2;
	    private String operator;

	    // Constructor to initialize the calculator
	   public  Calculator()
	   {

	        // Get user input
	        Scanner scanCalc = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        num1 = scanCalc.nextInt();
			
			System.out.print("Input the operator: ");
		    operator = scanCalc.toString();
			System.out.print("Input the second number: ");
			num2 = scanCalc.nextInt();
	   if (operator=="+") {
		   add(num1,num2);}
		   else if (operator=="-") {
			   subtract(num1,num2);
	   }
		   else if (operator)
	        

	        
	        /**
	         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
	         */

	        // Decide on the operation to perform 
	        /**
	         * Insert code to decide on which function to call, based on the operator the user chose
	         * Hint: Switch statement
	         */
	    }

	    public String add(int a, int b) {
	      return "a"+"+"+"b";
	    		  /**
	         * Enter logic
	         */
	    }

	    public String subtract(int a, int b) {
	        return "a"+"-"+"b";
	    	/**
	         * Enter logic
	         */
	    }

	    public String multiply(int a, int b) {
	        /**
	         * Enter logic
	         */
	    }

	    public String divide(int a, int b) {
	        /**
	         * Enter logic
	         */
	    }
	}
}
