package packageName;
import java.util.Scanner;

import packageName.BasicWeek;
public class mainfunctionality {
public static void main(String[] args) {
	int num;
	Scanner scan = new Scanner (System.in);
	System.out.print( "Which service would you like to use? \n" + " [1] : Basic week visualizer \n" + " [2] : Advanced week visualizer \n" + " [3] : Basic calculator \n" + " [4] : Employee1 repertoire \n");
	num= scan.nextInt();

if (num ==1) {
	BasicWeek bas = new BasicWeek ();
 bas.printDays();
		
}
else if(num==2) {
	AdvancedWeek adv = new AdvancedWeek ();
	adv. printDays();
	}
else if(num==3) {

Calculator calc = new Calculator ();
}

else if(num==4) {

	Employee1 emp = new Employee1 ();
System.out.print(emp.toString());
}


}
}

