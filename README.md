# Algorithms

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

package sorting.algorithms;

public class Utils {
	
	public static int[] generateRandomNumbersArray(int size) {
		int[] numbers = new int[size];
		for(int i=0;i<size; i++){
			numbers[i] = (int) (Math.random()*size);
		}
		return numbers;
	}
	
	public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
