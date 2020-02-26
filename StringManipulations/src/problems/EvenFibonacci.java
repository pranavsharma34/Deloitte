package problems;

import java.util.*;

public class EvenFibonacci {

	private static List<Integer> findEvenFibonnaci(int breakPoint) {
		List<Integer> evenFibonacciNumbers = new LinkedList<Integer>();
		int first = 1;
		int second = 2;
		evenFibonacciNumbers.add(second);
		int number = 0;
		while (number < breakPoint) {
			number = first + second;
			first = second;
			second = number;
			if (number % 2 == 0) {
				evenFibonacciNumbers.add(number);
			}
		}
		return evenFibonacciNumbers;
	}
	
	public static int findSum(int breakPoint) {
		List<Integer> evenFibonacciNumbers = findEvenFibonnaci(breakPoint);
		int sum = 0;
		for (int i = 0; i < evenFibonacciNumbers.size(); i++) {
			sum = sum + evenFibonacciNumbers.get(i);
		}
		System.out.println(sum);
		return sum;
	}
	
}
