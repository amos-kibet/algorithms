package searchSort;
/**
 * @author Amos Kibet
 *
 */
public class Search {

	/**
	 * @param args
	 */
	
	/**
	* Searches the array A for the integer N. If N is not in the array,
	* then -1 is returned. If N is in the array, then the return value is
	* the first integer i that satisfies A[i] == N.
	*/
	static int find(int[] A, int N) {
		for (int index = 0; index < A.length; index++) {
			if ( A[index] == N ) {
				return index; // N has been found at this index!
			}
		}
		// If we get this far, then N has not been found
		// anywhere in the array. Return a value of -1.
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 2, 3, 4, 10, 40 };
		int N = 40;
		
		//Function call
		int result = find(A, N);
		if (result == -1) {
			System.out.println("Element is not present in array");
		} else {
			System.out.println("Element found at index: "+result);
		}
	}

}
