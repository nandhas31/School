package school;

public class Sorts {

	public static void main(String[] args) {
		int[] arr = {2,5,7,2,5,3,8};
		arr = selectionSort(arr);
		System.out.println("done");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
	public static int[] selectionSort(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			int min = numbers[index];
			int target = index;
			for (int search = index + 1; search < numbers.length; search++) {
				if (numbers[search] < min) {
					min = numbers[search];
					target = search;
				
				}
			}
			
			int temp = numbers[index];
			numbers[index] = min;
			numbers[target] = temp;
			
		}
		return numbers;
	}

}
