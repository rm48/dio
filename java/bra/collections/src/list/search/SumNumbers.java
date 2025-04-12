package src.list.search;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {
	private List<Integer> numbers;
	public SumNumbers() {
		this.numbers = new ArrayList<>();
	}
	
	public void addNumbers(int number) {
		this.numbers.add(number);
	}
	
	public int calculateSum() {
		int sum = 0;
		for (Integer number : numbers)
			sum +=number;
		return sum;
	}
	
	public int findLargestNumber() {
	    int largestNumber = Integer.MIN_VALUE;
	      for (Integer number : numbers) {
	        if (number >= largestNumber) {
	        	largestNumber = number;
	        }
	      }
	      return largestNumber;
	  }
	
	public int findSmallestNumber() {
	    int smallestNumber = Integer.MAX_VALUE;
	      for (Integer number : numbers) {
	        if (number <= smallestNumber) {
	        	smallestNumber = number;
	        }
	      }
	      return smallestNumber;
	  }

	@Override
	public String toString() {
		return numbers + "";
	}
	 
	 
}
