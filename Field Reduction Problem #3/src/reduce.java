/*
ID: ikalvin1
LANG: JAVA
TASK: reduce
 */
import java.io.*;
import java.util.*;

public class reduce {
	public static void main(String[] args) throws IOException {
		 Scanner s = new Scanner(new File("reduce.in"));
//		Scanner s = new Scanner(new File("reduce.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"reduce.out")));

		ArrayList<Integer> xpos = new ArrayList<Integer>();
		ArrayList<Integer> ypos = new ArrayList<Integer>();
		int minXpos = 10000;
		int maxXpos = -10000;
		int minYpos = 10000;
		int maxYpos = -10000;

		int n = s.nextInt();
		while (s.hasNext()) {
			xpos.add(s.nextInt());
			ypos.add(s.nextInt());
		}

		// calculate max and min cows
		maxXpos = Collections.max(xpos);
		minXpos = Collections.min(xpos);
		maxYpos = Collections.max(ypos);
		minYpos = Collections.min(ypos);

		// remove cow farthest to the right
		ArrayList<Integer> rightXpos = new ArrayList<Integer>();
		rightXpos.addAll(xpos);
		ArrayList<Integer> rightYpos = new ArrayList<Integer>();
		rightYpos.addAll(ypos);
		int indexXRightCow = rightXpos.indexOf(maxXpos);
		rightXpos.remove(indexXRightCow);
		rightYpos.remove(indexXRightCow);

		// recalculate max and min cows
		maxXpos = Collections.max(rightXpos);
		minXpos = Collections.min(rightXpos);
		maxYpos = Collections.max(rightYpos);
		minYpos = Collections.min(rightYpos);
		int rightArea = (maxXpos - minXpos) * (maxYpos - minYpos);

		// remove cow farthest to the left
		ArrayList<Integer> leftXpos = new ArrayList<Integer>();
		leftXpos.addAll(xpos);
		ArrayList<Integer> leftYpos = new ArrayList<Integer>();
		leftYpos.addAll(ypos);
		int indexXLeftCow = xpos.indexOf(minXpos);
		leftXpos.remove(indexXLeftCow);
		leftYpos.remove(indexXLeftCow);

		// recalculate max and min cows
		maxXpos = Collections.max(leftXpos);
		minXpos = Collections.min(leftXpos);
		maxYpos = Collections.max(leftYpos);
		minYpos = Collections.min(leftYpos);
		int leftArea = (maxXpos - minXpos) * (maxYpos - minYpos);

		// remove cow farthest to the top
		ArrayList<Integer> topXpos = new ArrayList<Integer>();
		topXpos.addAll(xpos);
		ArrayList<Integer> topYpos = new ArrayList<Integer>();
		topYpos.addAll(ypos);
		int indexYTopCow = ypos.indexOf(maxYpos);
		topXpos.remove(indexYTopCow);
		topYpos.remove(indexYTopCow);

		// recalculate max and min cows
		maxXpos = Collections.max(topXpos);
		minXpos = Collections.min(topXpos);
		maxYpos = Collections.max(topYpos);
		minYpos = Collections.min(topYpos);
		int topArea = (maxXpos - minXpos) * (maxYpos - minYpos);

		// remove cow farthest to the bottom
		ArrayList<Integer> bottomXpos = new ArrayList<Integer>();
		bottomXpos.addAll(xpos);
		ArrayList<Integer> bottomYpos = new ArrayList<Integer>();
		bottomYpos.addAll(ypos);
		int indexYBottomCow = ypos.indexOf(minYpos);
		bottomXpos.remove(indexYBottomCow);
		bottomYpos.remove(indexYBottomCow);

		// recalculate max and min cows
		maxXpos = Collections.max(bottomXpos);
		minXpos = Collections.min(bottomXpos);
		maxYpos = Collections.max(bottomYpos);
		minYpos = Collections.min(bottomYpos);
		int bottomArea = (maxXpos - minXpos) * (maxYpos - minYpos);

		ArrayList<Integer> areas = new ArrayList<Integer>();
		areas.add(bottomArea);
		areas.add(topArea);
		areas.add(leftArea);
		areas.add(rightArea);
		
		out.println(Collections.min(areas));
		out.close();

	}
}