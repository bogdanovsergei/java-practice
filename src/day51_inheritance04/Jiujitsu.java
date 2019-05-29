package day51_inheritance04;

public class Jiujitsu extends Exercise {
	@Override
	public int perform (int minutes) {
		System.out.println("Jiujitsu");
		return minutes * 12;
	}
}
