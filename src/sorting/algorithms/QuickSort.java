package sorting.algorithms;

public class QuickSort {

public static void main(String[] args) {
	// Generate random numbers
	int[] numbers = Utils.generateRandomNumbersArray(10000);
	long startTime = System.currentTimeMillis();
	quickSort(numbers);
	long endTime = System.currentTimeMillis();
	long timeTaken = endTime - startTime;
	System.out.println("Time taken for InsertionSort::"+timeTaken);
	Utils.printArray(numbers);

}

private static int[] quickSort(int[] numbers) {
	// TODO Auto-generated method stub
	return null;
}
}
