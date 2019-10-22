//Header
//Program name: chapter 3 exercise 3
//Author: David Girard
//Class: cs 160 fall 2019
//Date: 10/22/19
//Description: Convert seconds into hours and minutes
	//with remainder in seconds

package modulus;
import java.util.Scanner;

/**
 * Converts seconds into hours, minutes, and seconds.
 */
public class Modulus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Exactly how many seconds: ");
        int sec = in.nextInt();
        int hour = sec / 3600;
        sec = sec % 3600;
        int min = sec / 60;
        sec = sec % 60;
        System.out.printf(" seconds = " + hour + " hour, " + min + " minutes, and " 
        + sec + " seconds.");     
    }
	}
/*Footer
* Exactly how many seconds: 6546
* seconds = 1 hour, 49 minutes, and 6 seconds.
*/

	
