package convertunits;

import java.util.Scanner;

public class Conversions {
    // Testing my function manually, because Junit seems to have some
    // issues in jenkins. Everything works fine, see for yourself..
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println(km2miles(scan.nextDouble()));
	System.out.println(miles2km(scan.nextDouble()));
	System.out.println(celsius2fahrenheit(scan.nextDouble()));
	System.out.println(fahrenheit2celsius(scan.nextDouble()));
    }

    // Convert km to miles
    public static double km2miles(double x) {
	return 0.621371 * x;
    }

    // Convert miles to km
    public static double miles2km(double x) {
	return x / 0.621371;
    }

    // Convert celsius to fahrenheit
    public static double celsius2fahrenheit(double x) {
	return 32.0 + (9.0 / 5.0) * x;
    }

    // Convert farhenheit to celsius
    public static double fahrenheit2celsius(double x) {
	return (x - 32.0) * (5.0 / 9.0) ;
    }
}
