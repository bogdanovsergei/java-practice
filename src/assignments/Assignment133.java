package assignments;

import java.util.*;

public class Assignment133 {
	public static void main(String[] args) {
		int[][][] values = new int[3][2][4];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				values[0][i][j] = 5;
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				values[1][i][j] = 7;
			}
		}

		for (int j = 0; j < 4; j++) {
			values[2][0][j] = 8;
		}
		
		values[2][1][0] = 30;
		values[2][1][1] = 31;
		values[2][1][2] = 32;
		values[2][1][3] = 33;
		
	}

}
