package assignments;

import java.util.*;


//=========WRONG DICISION==========

public class Assignment213 {
	public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
		int times = 0;
		int restOfFuel = 0;
		for (int i = 0; i < deliveries.size(); i++) {
			if (deliveries.get(i) >= restOfFuel) {
				if (deliveries.get(i) - restOfFuel == 0) {
					times += 1;
				}
				deliveries.set(i, deliveries.get(i) - restOfFuel);
			} else {
				times += deliveries.get(i) / restOfFuel;
				deliveries.set(i, deliveries.get(i) % restOfFuel);
			}
			times += deliveries.get(i) / max_fuel;
			
			if (deliveries.get(i) % max_fuel > 0) {
				restOfFuel = max_fuel - deliveries.get(i) % max_fuel;
			} else if (deliveries.get(i) % max_fuel == 0) {
				restOfFuel = 0;
			}
			if (i == deliveries.size()-1 && restOfFuel>0) {
				times += 1;
			}

		}

		return times;

	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(11);
		arr.add(1);
		arr.add(1);
		arr.add(3);
		arr.add(10);
		int times = refuel_times(arr, 3);
		System.out.print(times);// should output 5

	}// end main
}
