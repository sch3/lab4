package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] array) {
		
		/**
		 * I googled it!
		 */
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for(j = i - 1; (j >=0) && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j+1] = temp;
		}
		System.out.println(Arrays.toString(array));
		return array;

	}
}
