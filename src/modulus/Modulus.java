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
 * Converts seconds to hours and minutes.
 */
public class Modulus {

    public static void main(String[] args) {
        int sec;
        int hour, min, remainder;
        final int SEC_PER_MIN = 60;
        final int MIN_PER_HOUR = 60;
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Exactly how many seconds? ");
        sec = in.nextInt();
        
        min = (int) (sec / SEC_PER_MIN);
        hour = min / MIN_PER_HOUR;
        remainder = min /MIN_PER_HOUR;
        System.out.printf("%f sec = %f hour, %f min\n",
        		sec, hour, remainder);
        
        
        

        
    }

	
	}


	
