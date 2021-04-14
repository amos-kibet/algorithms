package searchSort;

import java.util.Arrays;

public class SelectionSortV3 {
	
	public static void main(String[] args) {
		int[] list = {2,1,4,5,6,3,9,8};
		int[] result = selectionSort(list);
		System.out.println(Arrays.toString(result));
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
