package assignments;
import java.util.*;
public class Assignment134 {
	public static void main(String[] args) {
		//WRITE YOUR CODE HERE
		//Scanner scan = new Scanner(System.in);
	    String[][] chessBoard = new String [8][8];
	    int nums = 1;
	    char chars = 'a';
		for (int i=0; i<8; i++) {
			for (int j=0; j<8; j++) {
				String numSt = Integer.toString(nums);
				chessBoard[i][j] = numSt + "" + chars;
				chars++;
			}
			nums++;
			chars = 'a';
		}
		
		
		
	    //DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));
	}

}
