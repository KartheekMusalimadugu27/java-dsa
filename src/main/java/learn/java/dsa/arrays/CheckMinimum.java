package learn.java.dsa.arrays;

/**
 * @author Kartheek
 * 
 *         Start with the first element, which is 9 in this example, and save it
 *         in minimum as the smallest value. Then, iterate over the rest of the
 *         array and compare the minimum to each element. If any element is
 *         smaller than the minimum, then set the minimum to that element. By
 *         the end of the array, the number stored in the minimum will be the
 *         smallest integer in the whole array.
 * 
 *         Time Complexity# 
 *         
 *         Since the entire list is iterated over once, this
 *         algorithm is in linear time, O(n) O(n) .
 *
 */
public class CheckMinimum {

	// Returns minimum value from given Array
	public static int findMinimum(int[] arr) {

		int minimum = arr[0];

		// At every Index compare its value with minimum and if its less
		// then make that index value new minimum value
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		return minimum;
	} // end of findMinimum

	public static void main(String args[]) {

		int[] arr = { 9, 2, 3, 6 };

		System.out.print("Array : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		int min = findMinimum(arr);
		System.out.println("Minimum in the Array: " + min);

	}

}
