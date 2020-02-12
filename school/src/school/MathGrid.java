package school;
import java.util.*;
public class MathGrid {
	public static ArrayList<Integer> numList = new ArrayList<Integer>();
	public static int[][] grid = new int[5][5];
	public static void rePop() {
		for (int i = -10; i <= 14; i++) {
			numList.add(i);
			System.out.println(i);
	}
	}
	public static void main(String[] args) {
		grid[0][0] = 1;
		while (!sumsCheck()) {
		System.out.println("running");
		rePop();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = (int)(Math.random() * numList.size() + numList.get(0));
			}
		}
		if (sumsCheck())
			System.out.println("found");
			
			
		}
	}
	public static boolean sumsCheck() {
		int sumRow1 = grid[0][0] + grid[0][1] + grid[0][2] + grid[0][3] + grid[0][4];
		int sumRow2 = grid[1][0] + grid[1][1] + grid[1][2] + grid[1][3] + grid[1][4];
		int sumRow3 = grid[2][0] + grid[2][1] + grid[2][2] + grid[2][3] + grid[2][4];
		int sumRow4 = grid[3][0] + grid[3][1] + grid[3][2] + grid[3][3] + grid[3][4];
		int sumRow5 = grid[4][0] + grid[4][1] + grid[4][2] + grid[4][3] + grid[4][4];
		
		int sumCol1 = grid[0][0] + grid[1][0] + grid[2][0] + grid[3][0] + grid[4][0];
		int sumCol2 = grid[0][1] + grid[1][1] + grid[2][1] + grid[3][1] + grid[4][1];
		int sumCol3 = grid[0][2] + grid[1][2] + grid[2][2] + grid[3][2] + grid[4][2];
		int sumCol4 = grid[0][3] + grid[1][3] + grid[2][3] + grid[3][3] + grid[4][3];
		int sumCol5 = grid[0][4] + grid[1][4] + grid[2][4] + grid[3][4] + grid[4][4];
		
		int sumDiag1 = grid[0][0] + grid[1][1] + grid[2][2] + grid[3][3] + grid[4][4];
		int sumDiag2 = grid[0][4] + grid[1][3] + grid[2][2] + grid[3][1] + grid[4][0];
		
		if (sumRow1 == sumRow2 && sumRow2 == sumRow3 && sumRow3 == sumRow4 && sumRow4 == sumRow5 && sumRow5 == sumCol1 && sumCol1 == sumCol2 && sumCol2 == sumCol3 && sumCol3 == sumCol4 && sumCol4 == sumCol5 && sumCol5 == sumDiag1 && sumDiag1 == sumDiag2)
			return true;
		return false;
	}
}
