package school;
import java.io.*;
public class Sorts {

	public static void main(String[] args) {
		int index = 0;
		int[] arr = new int[10000];
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/Users/SSNMFlex/Downloads/random10k.csv"));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
				arr[index] = Integer.parseInt(line);
				index++;
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println(arr[9999]);
		arr = mergeSort(arr);
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
	public static int[] insertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int index = i;
			for (int j = i-1; j >= 0 ; j--) {
				if (numbers[index] < numbers[j]) {
					int temp = numbers[index];
					numbers[index] = numbers[j];
					numbers[j] = temp;
					index--;
				}
				else {
					break;
				}
			}
			
		}
		
		
		return numbers; 
	}
	public static int[] mergeSort(int[] elements)
	   {
	      int n = elements.length;
	      int[] temp = new int[n];
	      mergeSortHelper(elements, 0, n - 1, temp);
	      return elements;
	   }

	   private static void mergeSortHelper(int[] elements,
	                                       int from, int to, int[] temp)
	   {
	       if (from < to)
	       {
	          int middle = (from + to) / 2;
	          mergeSortHelper(elements, from, middle, temp);
	          mergeSortHelper(elements, middle + 1, to, temp);
	          merge(elements, from, middle, to, temp);
	       }
	   }

	   private static void merge(int[] elements, int from,
	                             int mid, int to, int[] temp)
	   {
	      int i = from;
	      int j = mid + 1;
	      int k = from;

	      while (i <= mid && j <= to)
	      {
	         if (elements[i] < elements[j])
	         {
	            temp[k] = elements[i];
	            i++;
	         }
	         else
	         {
	            temp[k] = elements[j];
	            j++;
	         }
	         k++;
	      }

	      while (i <= mid)
	      {
	         temp[k] = elements[i];
	         i++;
	         k++;
	      }

	      while (j <= to)
	      {
	         temp[k] = elements[j];
	         j++;
	         k++;
	      }

	      for (k = from; k <= to; k++)
	      {
	         elements[k] = temp[k];
	      }
	   }
}
