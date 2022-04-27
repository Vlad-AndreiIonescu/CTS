package classes;

import java.util.HashMap;

public class CarFactory {

	private static HashMap<String, Car> hashMap = new HashMap<String, Car>();

	public static Car getCar(String colour) {
		Car p = null;
		if (hashMap.containsKey(colour)) {
			p = hashMap.get(colour);
			listMessage("Searching for a " + colour + " car.");
		} else {
			switch (colour) {
			case "green":
				p = new Car("green");
				listMessage("Created the green car.");
				break;
			case "yellow":
				p = new Car("yellow");
				listMessage("Created the yellow car.");
				break;
			case "blue":
				p = new Car("blue");
				listMessage("Created the blue car.");

				break;
			default:
				listMessage("The searched car is not available.");
			}
			hashMap.put(colour, p);
		}

		return p;
	}

	public static void listMessage(String message) {
		System.out.println(message);
	}
}
