package maximumhourglass;
 
import java.*;

public class Main {
    public static void main(String[] args) {
	// Empty
    }

    public static int maxHourglass(int[][] matrix) {
	int max = 0;
	int localSum;
	for (int n = 0; n < 4; n++) {
	    for (int m = 0; m < 4; m++) {
	 	localSum = matrix[m][n];
	 	localSum += matrix[m][n + 1];
	 	localSum += matrix[m][n + 2];
	 	localSum += matrix[m + 1][n + 1];
	 	localSum += matrix[m + 2][n];
	 	localSum += matrix[m + 2][n + 1];
	 	localSum += matrix[m + 2][n + 2];

		// Overwrite the initialization in the first iteration
		// incase all the values of localSum are less than
		// zero...
		if ((n == 0) && (m == 0)) {max = localSum; }
	 	if (localSum > max) { max = localSum; }
	    }
	}
	return max;
    }
}

