package packageName;
import java.util.Scanner;
public class Calculator {
	 private int num1;
	    private int num2;
	    private String operator;

	    // Constructor to initialize the calculator
	   public Calculator()
	   {

	        // Get user input
	        Scanner scanCalc = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        num1 = scanCalc.nextInt();
			
			System.out.print("Input the operator: ");
			scanCalc.nextLine();
			operator = scanCalc.nextLine();
		    
			System.out.print("Input the second number: ");
			num2 = scanCalc.nextInt();
			
	   if (operator.equals("+")) {
		System.out.print(add(num1,num2));}
		   else if (operator.equals("-")) {
			   System.out.print(subtract(num1,num2));
	   }
		   else if (operator.equals("*")) {
			  System.out.print (multiply(num1,num2));
		   }
		   else if(operator.equals("/")) {
			 System.out.print  (divide(num1,num2));
		   }
			   
	        
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
	      return (a) + "+" +(b) + "=" + (a+b);
	    		  /**
	         * Enter logic
	         */
	    }

	    public String subtract(int a, int b) {
	        return a + "-" + b + "=" + (a-b);
	    	/**
	         * Enter logic
	         */
	    }

	    public String multiply(int a, int b) {
	        return a+ "*" + b + "=" + a*b;
	        		/**
	         * Enter logic
	         */
	    }

	    public String divide(int a, int b) {
	       return a + "/" + b + "=" + a/b;
	       		 /**
	         * Enter logic
	         */
	    }
	}

