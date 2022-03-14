package packageName;

import java.util.Scanner;

public class Employee1 {
	
	
	    
		// Initializing variables
	    private String firstName;
	    private String lastName;
	    private int age;
	    private double salary;

	    public Employee1() {
	        // Get user input
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please input the employee's first name: ");
	    	firstName = scan.next();
	    	System.out.print("Please input the employee's last name: ");
	    	 lastName = scan.next();
	    	System.out.print("Please input the employee's age: ");
	    	 age = scan.nextInt();
	    	System.out.print("Please input the employee's monthly salary: ");
	    	 salary = scan.nextDouble();

	     
	     

	        /**
	         * Continue code here to ask for the first name, last name, age, and salary, IN THAT ORDER
	         */

	    }

	    public String toString() {
	    	return "Employee information: " + firstName+" " + lastName+" " +   age+" " +  salary ;
	        // insert logic for toString method
	    }
	}