package learn.java.dsa.arrays;

//Java program to left rotate an array by d elements
//using Juggling Algorithm
public class LeftRotateArraybyDefinedIndex {

	// Method 1
	// To left rotate arr[] of siz N by D
	void leftRotate(int arr[], int d, int n) {
		// To handle if d >= n
		d = d % n;
		int i, j, k, temp;
		int g_c_d = gcd(d, n);

		for (i = 0; i < g_c_d; i++) {

			// move i-th values of blocks
			temp = arr[i];
			j = i;

			// Performing sets of operations if
			// condition holds true
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	// Method 2
	// To print an array
	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	// Method 3
	// To get gcd of a and b
	int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	// Method 4
	// main driver method
	public static void main(String[] args) {
		// Creating instance of class inside main() method
		LeftRotateArraybyDefinedIndex rotate = new LeftRotateArraybyDefinedIndex();

		// Custom array elements
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		// Calling above methods inside main() to
		// left rotate and print the array elements
		rotate.leftRotate(arr, 3, arr.length);
		rotate.printArray(arr, arr.length);
	}

}
