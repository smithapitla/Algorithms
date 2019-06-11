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
