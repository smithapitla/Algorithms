package sorting.algorithms;

public class BubbleSort {

public static void main(String[] args) {
	
	int[] numbers = Utils.generateRandomNumbersArray(10);
	long startTime = System.currentTimeMillis();
	int[] sortedByBubbleSort = bubbleSort(numbers);
	long endTime = System.currentTimeMillis();
	long timeTaken = endTime - startTime;
	System.out.println("Time taken for bubbleSort::"+timeTaken);
	Utils.printArray(sortedByBubbleSort);

}

private static int[] bubbleSort(int[] numbers) {
	int n = numbers.length;
	boolean swapped;
	for(int i=0; i< n; i++){
		//First for loop - handles sorting in multiple passes
		swapped = false;
		for(int j=1; j<n; j++){
			if(numbers[j-1] > numbers[j]){
				swapped = true;
				int temp = numbers[j-1];
				numbers[j-1] = numbers[j];
				numbers[j] = temp;					
			}
		}
		
		/*if (swapped == false)
	        break;*/
		Utils.printArray(numbers);
	}
	return numbers;
}
}
