//Header
//Program name: chapter 3 exercise 4
//Author: David Girard
//Class: cs 160 fall 2019
//Date: 10/22/19
//Description: Use a Scanner to read the user's input number then use that number
	//and the random generator's to find the difference of the two numbers
	

package dg_ch3_ex4;
import java.util.Random;
import java.util.Scanner;
public class Random_generator {

	public static void main(String[] args) {
		
 {
		        // User's number
		        Scanner in = new Scanner(System.in);
		        System.out.print("my number is ");
		        int my_number = in.nextInt();
		    
		        // computer's random number
		        Random random = new Random();
		        int number = random.nextInt(100) + 1;
		        
		        //difference of the two numbers
		        System.out.println("computer's number is " + number);
		        int difference = number - my_number;
		        System.out.printf("difference = " + difference);
		    }
		}
	}
/*Footer
*my number is 45
*computer's number is 11
*difference = -34
*/