import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Loops {

	public static void main(String[] args) {

		// iterating over ArrayList
//		ArrayList<String> fruitList = new ArrayList<String>(Arrays.asList("apple", "banana", "grapes"));
//		System.out.println(fruitList);
//
//		for (String fruit : fruitList) { // for loop, can name fruit variable something else
//			System.out.println(fruit);
//		}
//
//		// works with Integer as well
//		ArrayList<Integer> ageList = new ArrayList<Integer>(Arrays.asList(25, 32, 90, 87, 52, 24, 42));
//		
//		for (Integer age : ageList) {
//			System.out.println(age);
//		}
		
		// iterating over HashMap
		HashMap<String, Integer> personMap = new HashMap<String, Integer>();
		personMap.put("Joan", 22);
		personMap.put("Daniel", 42);
		personMap.put("Anna", 34);
		
		for (Map.Entry<String, Integer> person: personMap.entrySet()) {
			System.out.println(person);
			
			String key = person.getKey();
			System.out.println("The key is: " + key);
			
			Integer age = person.getValue();
			System.out.println("The value is: " + age);
		}
	}
}
