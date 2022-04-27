package classes;

import java.util.Random;

public class Main {

	private static String[] colours = { "green", "yellow", "blue", "yellow", "green", "blue", "green" };

	public static void main(String args[]) {

		for (int i = 0; i < 10; i++) {
			CarFactory.getCar(getRandomColor());
		}
	}

	public static String getRandomColor() {
		Random random = new Random();
		int randomInt = random.nextInt(colours.length);
		return colours[randomInt];
	}
}
