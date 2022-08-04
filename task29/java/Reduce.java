package packager.corejava.task29.java;
import java.util.*;
public class Reduce {

	public static void main(String[] args)
	{

		// Creating list of integers
		List<Integer> array = Arrays.asList(-2, 4, 6, 8);

		// Finding sum of all elements
		int sum = array.stream().reduce(6,
				(element1, element2) -> element1 + element2);

		// Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);
	}
}




