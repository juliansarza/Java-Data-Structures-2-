import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEntry {
	public static void main(String[] args) {
		System.out.println("Hello");
//		You are a car dealer - create a hash map of vehicles:
//
//			The model is the Key, the make is the Value.
//
//			Ask the customer what car (model) they are looking for,
//
//			use the HashMap to determine if you have that vehicle, and what make it is.
//
//			(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")

		HashMap<String, String> vehicles = new HashMap<>();

		vehicles.put("Camaro", "Chevy");
		vehicles.put("Diablo", "Lambourghini");
		vehicles.put("Pinto", "Ford");
		vehicles.put("Civic", "Honda");

		System.out.println(vehicles);

		Scanner input = new Scanner(System.in);

		System.out.println("What model are you looking for?");
		String model = input.nextLine();

		System.out.println(model);

		for (Map.Entry<String, String> vehicle : vehicles.entrySet()) {
//			System.out.println(vehicle);
			String currentVehicleModel = vehicle.getKey();
//			System.out.println(currentVehicleModel);
			if (model.equals(currentVehicleModel)) {
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", model,
						vehicle.getValue());
			}
		}
	}
}
