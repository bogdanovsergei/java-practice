package day33_methods05;

public class PayCalculator {
	public static void main(String[] args) {
		int pay = getHourlyPay(40, 50);
		System.out.println("Total pay for 40 hours: " + pay);
		pay = getHourlyPay(0, 50);
		pay = getHourlyPay(40, 0);
	}

	public static int getHourlyPay(int hour, int rate) {

		if (hour <= 0) {
			System.out.println("Invalid hours");
			return 0;
		}
		if (rate <= 0) {
			System.out.println("Invalid rate");
			return 0;
		}

		return hour * rate;
	}

}
