package sorting.algorithms;

public class MergeSort {

public static void main(String[] args) {
	// Generate random numbers
	int[] numbers = Utils.generateRandomNumbersArray(10);
	long startTime = System.currentTimeMillis();
	mergeSort(numbers);
	long endTime = System.currentTimeMillis();
	long timeTaken = endTime - startTime;
	System.out.println("Time taken for InsertionSort::"+timeTaken);
	Utils.printArray(numbers);

}

private static int[] mergeSort(int[] numbers) {
	// TODO Auto-generated method stub
	return null;
}
}
