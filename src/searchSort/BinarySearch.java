package searchSort;
/**
 * @author Amos Kibet
 *
 */
public class BinarySearch {
	
	static int find(int[] A, int N) {
		int lowestPossibleLoc = 0;
		int highestPossibleLoc = A.length -1;
		
		while (highestPossibleLoc >= lowestPossibleLoc) {
			int middle = (lowestPossibleLoc + highestPossibleLoc) / 2;
			if (A[middle] == N) {
				return middle;
			} else if(A[middle] > N) {
				// eliminate locations >= middle
				highestPossibleLoc = middle -1;
			} else {
				// eliminate locations <= middle
				lowestPossibleLoc = middle +1;
			}
		}
		
		// At this point, highestPossibleLoc < LowestPossibleLoc,
		// which means that N is known to be not in the array. Return
		// a -1 to indicate that N could not be found in the array.
		return -1;
	}

	public static void main(String[] args) {
		int[] A = {2,3,4,5,5,6,7,8,9,11,13,34,45,46,56};
		int N = 56;
		
		//Function call
		int result = find(A, N);
		if (result == -1) {
			System.out.println("Element is not present in array");
		} else {
			System.out.println("Element found at index: "+result);
		}
	}
}
