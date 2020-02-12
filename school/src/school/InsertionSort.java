package school;

public class InsertionSort {
	public static void main(String[] args) {
		int[] nums = {4,6,2,7,3,5};
		insertionSort(nums);
	}
	
	public static void insertionSort(int[] nums) {
		
		for (int index = 1; index < nums.length; index++) {
		for	(int index2 = 1; index - index2 >= 0; index2++){	
				int pos = index;
				if (nums[pos] < nums[pos - index2]) {
					int temp = nums[pos];
					nums[pos] = nums[pos-index2];
					nums[pos - index2] = temp;
					pos--;
				}
			}
			}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
			
	}
	
}
