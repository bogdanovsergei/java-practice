package day27_arrays05;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		double[] d1 = {2.3, 4.5, 12.4};
		double[] d2 =d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 1000.3;
		System.out.println(Arrays.toString(d1));//when you change d1, d2 changes too
		System.out.println(Arrays.toString(d2));
		
		d2[1] = 4000.5;
		System.out.println(Arrays.toString(d1));// when you change d2, d1 changes too
		System.out.println(Arrays.toString(d2));
		
		double[] d3 = Arrays.copyOf(d2, d2.length); // copy everything from d2
		System.out.println(Arrays.toString(d3));	// if you change d3 , d1 & d2 will not change
		d2[0] = 1.0;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		
	}

}
