import java.util.Scanner;

import packageName.BasicWeek;

public class mainfunctionality {
public static void main(String[] args) {
	int num;
	Scanner Scan = new Scanner (System.in);
	System.out.print( "Which service would you like to use? \n" + " [1] : Basic week visualizer \n" + " [2] : Advanced week visualizer \n" + " [3] : Basic calculator \n" + " [4] : Employee repertoire \n");
	num= Scan.nextInt();

if (num ==1) {
	BasicWeek bas = new BasicWeek ();
 bas.printDays();
		
}
else if(num==2) {
	AdvancedWeek adv = new AdvancedWeek ();
	adv. printDays();
	}
else if(num==3) {
calculator calc = new calculator ();
calc.



}


}