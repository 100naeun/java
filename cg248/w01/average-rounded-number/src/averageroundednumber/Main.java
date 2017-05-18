package averageroundednumber;

import java.util.Scanner;

// Read three floats and return their average as a floating point
// number with a precision of two decimal places. I decided to use
// "double" in my code, because the precision of a float was not high
// enough for some of the test cases...
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double first = scan.nextDouble();
	double second = scan.nextDouble();
	double third = scan.nextDouble();

	double average = ((first + second + third) / ((double) 3.0));
	double remainder =  average % (double) 0.01;

	if(remainder >= 0.005) {
	    average = average - remainder + (double) 0.01;
	} else {
	    average = ((double) ((int) (average * 100)) / (double) 100.00);

	    // This doesn't work, because the precision of the
	    // remainder is not always high enough:
	    //	    average = average - remainder;
	}

	// The following if statement fixes this strange test case:
	// Running 9 testcases: FAILED at test
	// testcases/average-rounded-number-02
	// Input was: 0.1 0.1 0.1
	// expected:<0.1[0]> but was:<0.1[]>

	// And this test case..
	// Running 9 testcases: FAILED at test
	// testcases/averageroundednumber-01-generated
	// Input was: 2.0 1.0 3.0
	//  expected:<2.0[0]> but was:<2.0[]>


	if (average % (double) 1.0 == 0.0) {
	    remainder = (double) 0.0;
	}

	if (average % (double) 0.1 == 0.0) {
	    remainder = (double) 0.0;
	}

	if(remainder == 0.0) {
	    System.out.println(average + "0");
	} else {
	    remainder =  average % (double) 0.1;
	    System.out.println(average);
	}
    }
}
