/*
ID: ikalvin1
LANG: JAVA
TASK: bcs
 */
import java.io.*;
import java.util.*;

public class bcs {
	public static void main(String[] args) throws IOException {
		// Scanner s = new Scanner(new File("bcs.in"));
		Scanner s = new Scanner(new File("bcs.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"bcs.out")));

		int n = s.nextInt();
		int k = s.nextInt();

		char[][] original = new char[n][n];

		// read in original figurine into 2d array
		for (int row = 0; row < n; row++) {
			String c = s.next();
			System.out.println(c);

			for (int col = 0; col < n; col++) {
				original[row][col] = c.charAt(col);
			}

		}

		out.close();

	}

	public static void printArray(char[][] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}