import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		// Ask the user for five (5) numbers
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");		
		Integer firstNumber = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter another number");
		Integer secondNumber = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter another number");
		Integer thirdNumber = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter another number");
		Integer fourthNumber = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter another number");
		Integer fifthNumber = Integer.parseInt(input.nextLine());
		
		// Store those five (5) numbers in an array list.
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(firstNumber,
				secondNumber, thirdNumber, fourthNumber, fifthNumber));
		
		System.out.println(numberList);
		
		// Find the sum, product, largest, and smallest of those numbers.
		
		Integer sum = 0;
		Integer product = 1;
		Integer largestNumber = numberList.get(0);
		Integer smallestNumber = numberList.get(0);

		for (Integer number : numberList) {
			System.out.println(number);
			sum = sum + number;
			product = product * number;

			if (number > largestNumber) {
				largestNumber = number;
			}

			if (number < smallestNumber) {
				smallestNumber = number;
			}

		}

		System.out.printf("The sum is: %d\n", sum);
//		System.out.println("The sum is " + sum);
		System.out.printf("The product is: %d\n", product);

		System.out.printf("The largest number is: %d\n", largestNumber);
		System.out.printf("The smallest number is: %d\n", smallestNumber);

	}
}
