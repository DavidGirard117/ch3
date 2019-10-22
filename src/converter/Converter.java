//Header
//Program: Chapter 3 exercise 2
//Author: David Girard
//Class: cs160 Fall 2019
//Date: 10/22/2019
//Description: Convert Celsius into Fahrenheit.  

package converter;
import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		double fahrenheit;
		int celsius;
		Scanner in = new Scanner(System.in);
		
		//prompt user to get the value
		System.out.print("What's the temperature in fahrenheit? ");
		fahrenheit = in.nextDouble();
		
		
		//convert and output the result
		celsius = (int) (fahrenheit);
		fahrenheit = celsius * (9.0/5.0) +32;
		System.out.printf("%d c = %.1f f", celsius, fahrenheit);
		in.close();
	}

}
/* footer
 * What's the temperature in fahrenheit? 0
 *0 c = 32.0 f
 */
