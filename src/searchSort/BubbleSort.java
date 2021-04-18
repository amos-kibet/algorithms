package searchSort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) throws Exception {
      
        int[] A = {3,4,2,4,3,5,7,8,6,9,3,6,7};
        int n = A.length;
        
        System.out.println(Arrays.toString(SimpleBubbleSort(A, n)));

    }

    public static int[] SimpleBubbleSort(int[] A, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (A[j] > A[j + 1 ]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
       
        return A;
    }
}
