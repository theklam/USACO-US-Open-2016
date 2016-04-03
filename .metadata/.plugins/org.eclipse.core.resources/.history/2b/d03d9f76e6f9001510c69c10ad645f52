/*
ID: ikalvin1
LANG: JAVA
TASK: diamond
 */
import java.io.*;
import java.util.*;

public class diamond {
	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(new File("diamond.in"));
		Scanner s = new Scanner(new File("diamond.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"diamond.out")));
		
		int n = s.nextInt();
		int k = s.nextInt();
		int min = 100000;
		int max = -100000;
		int minCounter = 0;
		int midCounter = 0;
		int maxCounter = 0;
		int diamondsInCase = 0;
		ArrayList<Integer> sizes = new ArrayList<Integer>();
		
		while(s.hasNext()) {
			int current = s.nextInt();
			if(current < min) {
				min = current;
			}
			if(current > max) {
				max = current;
			}
			sizes.add(current);
		}
		
//		Collections.sort(sizes);
		
		
//		for(int size: sizes) {
//			System.out.println(size);
//		}
//		System.out.println(max + " " + min);
		
		for(int size: sizes) {
			//see how many diamonds can fit in the case if we include the minimum value
			if(size <= min + k) {
				minCounter++;
			}
			//see how many diamonds can fit in the case if we include the maximum value
			if(size >= max - k) {
				maxCounter++;
			}
		}
		
		System.out.println("Min counter " + minCounter);
		System.out.println("Max counter " + maxCounter);
		
		if(minCounter > maxCounter) {
			diamondsInCase = minCounter;
		}
		else {
			diamondsInCase = minCounter;
		}
		
		System.out.println("max diamonds in case " + diamondsInCase);
		
		out.println(diamondsInCase);
		out.close();

	}
}