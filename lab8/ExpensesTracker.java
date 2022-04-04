package lab2;


	import java.io.FileWriter;  // Import the FileWriter class
	import java.io.IOException;  // Import the IOException class to handle errors
	import java.util.Scanner;

	public class ExpensesTracker{
	  public static void main(String[] args) throws IOException{
	      
		FileWriter writer = new FileWriter("Expenses.txt");
		Scanner scan = new Scanner(System.in);
		
		String name;
		String purchase;
		String cost;
		String decision = "";
		while(decision =="y") {
		System.out.print("Input your name: ");
		name = scan.next();
		
		System.out.print("What did you purchase? ");
		purchase = scan.next();
		
		System.out.print("How much did you pay? ");
		cost = scan.next();
		
		writer.write(name + " purchased " + purchase + " for " + cost + "US Dollars.\r\n");
		
		System.out.print("Would you like to log another purchase? (y/n)");
		decision = scan.next();
		}
		
		writer.close();
		scan.close();
	  }
		
	 }
	




