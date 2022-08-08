import java.util.HashMap;

public class HashMaps {
	
	public static void main(String[] args) {
		
		// put, get, remove
		HashMap<String, Integer> gradeList = new HashMap<>();
		System.out.println(gradeList); // empty
		
		gradeList.put("Joan", 71);
		gradeList.put("Anna", 94);
		gradeList.put("Mike", 85);
		gradeList.put("Daniel", 62);
		
		System.out.println(gradeList); // added properties
		
		Integer mikesGrade = gradeList.get("Daniel");
		
		System.out.println(mikesGrade);
		System.out.println(gradeList.containsKey("Anna")); // returns boolean (true or false)
	}

}
