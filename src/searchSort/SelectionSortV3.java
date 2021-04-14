package searchSort;

import java.util.Arrays;

public class SelectionSortV3 {
	
	int maxArraySize=10000; // Array Size
	int[] list1 = new int[maxArraySize]; // First Array
	int[] list2 = new int[maxArraySize]; // Second Array
	
	public SelectionSortV3(){
		// Class Constructor
		for (int i = 0; i < list1.length; i++) {
			// Filling two arrays with the same random numbers.
			list1[i]=(int)(Integer.MAX_VALUE * Math.random());
			list2[i]=list1[i];
		}
		
		long startTimeArray1 = System.currentTimeMillis(); // Start computing time for SelectionSort
		int[] result = selectionSort(list1); // Sorting Array1 with SelectionSort
		long runTimeArray1 = System.currentTimeMillis() - startTimeArray1; // Time to run the SelectionSort
		System.out.println(Arrays.toString(result));
		
		long startTimeArray2 = System.currentTimeMillis();// Start computing time for Arrays.sort
		Arrays.sort(list2); // Sorting Array2 with Arrays.sort
		long runTimeArray2 = System.currentTimeMillis() - startTimeArray2; // Time to run the Arrays.sort
		System.out.println(Arrays.toString(list2));
		
		System.out.println("SelectionSort time(sec):"+runTimeArray1/1000.0); // Print results
		System.out.println("Arrays Sort time(sec):"+runTimeArray2/1000.0); // Print results
	}
	
	public static void main(String[] args) {
		
		new SelectionSortV3();
		
	/*	
		int maxArraySize=10000; // Array Size
		int[] list = new int[maxArraySize]; // First Array
		int[] list2 = new int[maxArraySize]; // Second Array
		
		for (int i = 0; i < list.length; i++) {
			// Filling two arrays with the same random numbers.
			list[i]=(int)(Integer.MAX_VALUE * Math.random());
			//list2[i]=list[i];
		}
		
		// Time how long this algorithm takes
		int[] result = selectionSort(list);
		
		
		System.out.println(Arrays.toString(result));
	*/
	}
   
	public static int[] selectionSort(int[] list) {
		int i, j, minValue, minIndex, temp = 0;
		
		for (i = 0; i < list.length; i++) {
			minValue = list[i]; // Assign 1st value in list as mimimum value
			minIndex = i;
			
			for (j = i + 1; j < list.length; j++) {
				if (list[j] < minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			
			if (minValue < list[i]) {
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		return list;
	}
	
}
