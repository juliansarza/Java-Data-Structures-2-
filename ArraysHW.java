import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysHW {

	public static void main(String[] args) {

		// 1
//		// Ask the user for five (5) numbers
//
//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter a number: ");
//		Integer firstNumber = Integer.parseInt(input.nextLine());
//
//		System.out.println("Enter another number");
//		Integer secondNumber = Integer.parseInt(input.nextLine());
//
//		System.out.println("Enter another number");
//		Integer thirdNumber = Integer.parseInt(input.nextLine());
//
//		System.out.println("Enter another number");
//		Integer fourthNumber = Integer.parseInt(input.nextLine());
//
//		System.out.println("Enter another number");
//		Integer fifthNumber = Integer.parseInt(input.nextLine());
//
//		// Store those five (5) numbers in an array list.
//
//		ArrayList<Integer> numberList = new ArrayList<Integer>(
//				Arrays.asList(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber));
//
//		System.out.println(numberList);
//
//		// Find the sum
//
//		Integer sum = 0;
//		
//		for (Integer number : numberList) {
//			System.out.println(number);
//			sum = sum + number;
//		}
//		
//		System.out.printf("The sum is: %d\n", sum);

		// 2
//		// What is the output?
//		double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
//
//		double maximum = exampleArray[0];
//
//		int index = 0;
//
//		for (int i = 1; i < exampleArray.length; i++) {
//
//			if (exampleArray[i] > maximum) {
//
//				maximum = exampleArray[i];
//
//				index = i;
//			}
//		}
//		System.out.println(index); // 2 (after fixing a couple of errors)

		// 3
		// toPower

		// Ask the user for a index and a power

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an index: ");
		Integer index = input.nextInt();

		System.out.println("Enter a power: ");
		Integer power = input.nextInt();

		toPower(index, power);
	}

	public static Integer toPower(Integer index, Integer power) {
		Integer answer = 1;
		
		System.out.println("Hey, world!");

		System.out.println("Index: " + index);
		System.out.println("Power: " + power);

		for (Integer i = 0; i < power; i++) {
			answer *= index;
		}

		System.out.println("Answer:" + answer);

		return answer;
	}

}
