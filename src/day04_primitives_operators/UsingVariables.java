package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare num1, num2, num3
		int num1, num2, num3;
		/* assign 100 to num1
		 * assign values of num1 to num2
		 * Print num1 and num2 values in separate lines
		*/
		num1 = 100;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		
		num2=200;
		num1=num2;
		num3=num1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		//declare apples and assign 25
		//declare kiwis and assign value of apple to it
		//declare mangoes and assign 55
		//assign mangos to kiwis
		
		int apples = 25;
		int	kiwis = apples;
		int	mangoes = 55;
			kiwis = mangoes;
			
			System.out.println(apples);
			System.out.println(kiwis);
			System.out.println(mangoes);
	}

}
