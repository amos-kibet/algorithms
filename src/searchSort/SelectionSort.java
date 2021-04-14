package searchSort;

import java.util.Arrays;

/**
 * @author AmosKibet
 *
 */
public class SelectionSort {

	void selectionSort(int[] A) { // A={2,1,4,5,6,3,9,8}
		// Sort A into increasing order, using selection sort
		int size = A.length; // 8
		for (int step = 0; step < size -1; step++) {
			int minIndex = step; // 0
			for (int i = 1; i < size; i++) {
				if (A[i] < A[minIndex]) {
					minIndex = i; // 1
				}
			}
			// put min value at the correct position
		    int temp = A[step]; //2
		    A[step] = A[minIndex]; //1
		    A[minIndex] = temp; //2
			
		}
	}
	
	public static void main(String[] args) {
		int[] A = {2,1,4,5,6,3,9,8};
	    SelectionSort ss = new SelectionSort();
	    ss.selectionSort(A);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(A));
		
	}
}
