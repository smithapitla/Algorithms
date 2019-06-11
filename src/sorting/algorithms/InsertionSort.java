package sorting.algorithms;

public class InsertionSort {

public static void main(String[] args) {
	
	// Generate random numbers
	int[] numbers = Utils.generateRandomNumbersArray(10);
	long startTime = System.currentTimeMillis();
	insertionSort(numbers);
	long endTime = System.currentTimeMillis();
	long timeTaken = endTime - startTime;
	System.out.println("Time taken for InsertionSort::"+timeTaken);
	Utils.printArray(numbers);

}

private static int[] insertionSort(int[] numbers) {
	int n = numbers.length;
    for (int i=1; i<n; ++i)
    {
        int key = numbers[i];
        int j = i-1;

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
        while (j>=0 && numbers[j] > key)
        {
        	numbers[j+1] = numbers[j];
            j = j-1;
        }
        numbers[j+1] = key;
        Utils.printArray(numbers);
    }
    return numbers;
}
}
