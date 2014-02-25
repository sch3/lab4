package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		/**
         * TODO
         * Implement bubble sort
         */
    	boolean done = false;
    	while(!done){
    		done = true;
        	for(int i=0;i<array.length-1;i++){
        		if(array[i]>array[i+1]){
        			//System.out.println("Swapped");
        			int tmp = array[i];
        			array[i] = array[i+1];
        			array[i+1] = tmp;
        			done = false;
        		}
        	}
    	}
    	//System.out.println(Arrays.toString(array));
        return array;
	}
}
