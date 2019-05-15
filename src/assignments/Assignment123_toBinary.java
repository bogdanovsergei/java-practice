package assignments;
import java.util.*;
public class Assignment123_toBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
	    int i = 1;
	    while (i<=binary.length) {
	    	
	    	binary[binary.length-i] = decimal%2;
	    	decimal = decimal/2;
	    	i++;
	    }
	    System.out.println(Arrays.toString(binary));
	}

}
