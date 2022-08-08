import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		// add, remove, get, and set methods
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println(nameList); // empty
		
		nameList.add("Jonathan");
		nameList.add("Bob");
		nameList.add("Heather");
		nameList.add("Beatrice");
		
		System.out.println(nameList); // populated
		
		nameList.set(1, "Robert");
		nameList.remove(3);
		
		String myName = nameList.get(0);
		
		System.out.println(nameList); // updated
		System.out.println(myName);
	}
}
