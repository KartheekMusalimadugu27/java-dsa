package learn.java.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUsingHashMap {

	// Time complexity: O(n)
	private static int[] findTwoSum(int[] nums, int target) {

		HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			Integer requiredNum = (Integer) (target - nums[i]);
			if (indexMap.containsKey(requiredNum)) {
				int toReturn[] = { indexMap.get(requiredNum), i };
				return toReturn;
			}

			indexMap.put(nums[i], i);
		}
		return null;
	}

	public static void main(String args[]) {
		int n = 9;
		int[] arr1 = { 2, 4, 5, 7, 8 };
		int[] arr2 = new int[2];
		if (arr1.length > 0) {
			arr2 = findTwoSum(arr1, n);
			int num1 = arr1[arr2[0]];
			int num2 = arr1[arr2[1]];

			if ((num1 + num2) != n)
				System.out.println("Not Found");
			else {
				System.out.println("Number 1 = " + num1);
				System.out.println("Number 2 = " + num2);
				System.out.println("Sum = " + (n));

			}
		} else {
			System.out.println("Input Array is Empty!");
		}
		
		System.out.println("Printng the Indices :" + Arrays.toString(arr2));
	}
}
