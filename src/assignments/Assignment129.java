package assignments;
import java.util.*;
public class Assignment129 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rwos
	    
	    //your code here
	    
	    int matches = 0;
		
	    for (int i=0; i<arr.length; i++) {
	    	for (int j=0; j<arr[i].length; j++) {
	    		for (int k=j; k<arr[i].length; k++) {
	    			if (arr[i][j] == arr[i][k] && j!=k) {
	    				matches++;
	    			}
	    		}
	    	}
	    }
			
			
	    
	    
	    System.out.print("matches: " + matches);
	}

}
