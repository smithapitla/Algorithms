package sorting.algorithms;

public class SelectionSort {

public static void main(String[] args) {
	
	// Generate random numbers
	int[] numbers = Utils.generateRandomNumbersArray(1000);
	long startTime = System.currentTimeMillis();
	selectionSort(numbers);
	long endTime = System.currentTimeMillis();
	long timeTaken = endTime - startTime;
	System.out.println("Time taken for InsertionSort::"+timeTaken);
	Utils.printArray(numbers);

}

private static int[] selectionSort(int[] numbers) {
	int n = numbers.length;
	boolean swapped;
	for(int i=0; i< n; i++){
		//First for loop - handles sorting in multiple passes
		swapped = false;
		for(int j=1; j<n; j++){
			if(numbers[j] < numbers[j-1]){
				swapped = true;
				int temp = numbers[j-1];
				numbers[j-1] = numbers[j];
				numbers[j] = temp;					
			}
		}
		
		if (swapped == false)
	        break;
		Utils.printArray(numbers);
	}
	return numbers;
}
}
