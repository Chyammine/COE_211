package packageName;
import java.util.Scanner;

public class lab9 {
public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in); 
		int[] num = new int[5];
		for(int i= 1;i<=5;i++) {

		System.out.println("Input the grade of assignment "+i);
		 num [i-1] =  scan.nextInt();
		}
		System.out.println("Input the number of attended lab: ");
		int labs = scan.nextInt();
		 System.out.println("Input the midterm grade: ");
		 int mid = scan.nextInt();
		 
	int sum =0;
		 for(int i=0;i<=4;i++) {
			
			 sum+=num[i];}
		 
		 
		 
		 
		 System.out.println("Assignments(30%): "+ (sum/7));
		 System.out.println("Attendance(5%): "+ (labs*100*0.05));
		 System.out.println("Midterm(30%): "+ (mid*0.3));
		 
	
	 


}}