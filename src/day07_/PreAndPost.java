package day07_;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;//num2 = num;
						// num = num+1
		
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		
		int n =0;
		int n2 = ++n;	//n = n+1;
						//n2 = n
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);
		
		int i =10;
		i++;
		++i;
		System.out.println(i);
		
		int bananas = 6;
		int pears = bananas++;
		int apples = ++bananas;
		System.out.println("bananas: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);
		
		int friends = 10;
		System.out.println(friends++); // first - print(friends, then - increase by 1)
		System.out.println(friends);
		
		int p1 = 10;
		int sum = p1++ + 5; //sum = p1 + 5;
							//p1 = p1 + 1;
		System.out.println("sum: " + sum);
		System.out.println("p1: " + p1);
		
		int sum2= ++p1 + 5;	//p1 = p1 + 1;
							//sum = p1 + 5;

		System.out.println("sum2: " + sum2);
		System.out.println("p1: " + p1);
		
		//=======================================
		
		int batteries = 8;
		int oldBatteries = 5;
		int totalBatteries = batteries++ + ++oldBatteries;
		System.out.println("batteries: " + batteries);				//9
		System.out.println("oldBatteries: " + oldBatteries);		//6
		System.out.println("totalBatteries: " + totalBatteries);	//14
		
	}

}
