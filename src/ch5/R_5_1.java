package ch5;
/* Base case: if the array has length 1, return that one element */
/* Recursive: look for a max in the array of length n - 1 and compare it to the 'current max'*/
public class R_5_1 {
	public static int findMaxRecursive(int [] array, int n) {
		if(n == 1) {
			return array[0];
		}
		int currentMax = array[n-1];
		int newMax = findMaxRecursive(array, n-1);
		if(currentMax < newMax) {
			return newMax;
		}
		return currentMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {540,2,98,4, 300, 200, 250, 301, 500, 400,360,312};
		int max = findMaxRecursive(array, array.length);
		System.out.println(max);

	}

}
