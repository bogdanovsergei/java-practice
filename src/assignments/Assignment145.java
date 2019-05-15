package assignments;
import java.util.*;
public class Assignment145 {
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++)
	    {

	        arr[i]=inp.nextInt();
	    }
	    
	    plus_minus(arr);
	  }//end main

	private static void plus_minus(int[] arr) {
		// TODO Auto-generated method stub
		int negative=0;
		int positive=0;
		int zeros=0;
		for (int i=0 ;i<=arr.length;i++) {
			if(arr[i]<0) {
				negative++;
			} else if (arr[i]>0) {
				positive++;
			} else {
				zeros++;
			}
		}
		System.out.println("positives:" + positive + ", negatives:" + negative + ", zeros:" + zeros);
	}
}
