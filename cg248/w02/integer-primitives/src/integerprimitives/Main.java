package integerprimitives;

import java.util.Scanner;

public class Main {
    // Search for primitive data types: byte, short, int, long
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// This flag tells me if it has any of the scans completed successfully.
	int flag = 1;
	// This flag tells me if the individual scans completed successfully.
	int i = 0,  s = 0, l = 0, b = 0;
	
	if(scan.hasNextInt()) {
	    i = 1;
	    flag = 0;
	}	

	if(scan.hasNextShort()) {
	    s = 1;
	    flag = 0;
	}	

	if(scan.hasNextLong()) {
	    l = 1;
	    flag = 0;
	}	

	if(scan.hasNextByte()) {
	    b = 1;
	    flag = 0;
	}
	
	if(flag == 0) {
	    System.out.println(scan.nextLong() + " fits in:");
	    if(b ==1) {
		System.out.println("* byte");
	    }

	    if(s ==1) {
		System.out.println("* short");
	    }

	    if(i ==1) {
		System.out.println("* int");
	    }

	    if(l ==1) {
		System.out.println("* long");
	    }

	} else {
	    System.out.println("\"" + scan.next() + "\"" + " doesn't fit anywhere.");
	}
    }
}
