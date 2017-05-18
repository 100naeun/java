package timetowords;

import java.util.Scanner;

public class Main {
    // Read the user input time and return the same thing in words
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int hours = -1;
	int minutes = -1;
	if(scan.hasNextInt()) hours = scan.nextInt();
	if(scan.hasNextInt()) minutes = scan.nextInt();
	int good_input = 1;

	if(!((1 <= hours) && (12 >= hours))) {
	    good_input = 0;
	}

	if(!((0 <= minutes) && (60 >= minutes))) {
	    good_input = 0;
	}

	if(good_input == 1) {
	    if(minutes == 0) {
		System.out.println(hours(hours) + " o'clock");
	    } else {
		// Beyond half past:
		if(minutes > 30) hours = ((hours + 1) % 13);
		if(hours == 0) hours = hours + 1;
		System.out.println(min(minutes) + hours(hours));
	    }
	} else {
	    System.out.println("Wrong Input");
	}
    }

    // Return 1 to twelve (it doen't necessarily have to be hours)..
    private static String hours(int hours) {
	if(hours == 1) return "one";
	if(hours == 2) return "two";
	if(hours == 3) return "three";
	if(hours == 4) return "four";
	if(hours == 5) return "five";
	if(hours == 6) return "six"; 
	if(hours == 7) return "seven";
	if(hours == 8) return "eight";
	if(hours == 9) return "nine";
	if(hours == 10) return "ten";
	if(hours == 11) return "eleven";
	if(hours == 12) return "twelve";

	// This should never occur...
	return "Wrong Input";
    }

    // Handle 1 to 30 minutes
    private static String minutes_till_thirty(int minutes) {
	int tens = minutes / 10;
	int ones = (minutes - (10 * (tens)));

	// Why implement the same thing twice?
	if(((minutes <= 12)) && !(minutes == 1)) {
	    return hours(minutes) + " minutes";
	} else {
	    if(tens == 0) {
		if(ones == 1) return "one minute";
	    }

	    if(tens == 1) {
		if(ones == 3) return "thirteen" + " minutes";
		if(ones == 4) return "fourteen" + " minutes";
		if(ones == 5) return "quarter";
		if(ones == 6) return "sixteen" + " minutes";
		if(ones == 7) return "seventeen" + " minutes";
		if(ones == 8) return "eighteen" + " minutes";
		if(ones == 9) return "nineteen" + " minutes";
	    }

	    if(tens == 2) {
		// Lets recycle again!
		if(ones > 0) return "twenty " + hours(ones) + " minutes";
		if(ones == 0) return "twenty" + " minutes";
	    }

	    if(tens == 3) {
		if(ones == 0) return "half";
	    }

	    // This should never occur...
	    return "Wrong Input";
	}
    }

    // Split the minutes into two cases and pass it on
    private static String min(int min) {
	if(min <= 30) {
	    // Count up to thirty
	    return minutes_till_thirty(min) + " past ";
	} else {
	    // Count down from thirty
	    return minutes_till_thirty(60 - min) + " to ";
	}
    }
}
