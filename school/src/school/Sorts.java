package school;
import java.io.*;
//Nandha Sundaravadivel
//Sorts Program: Includes the three sort methods in the AP subset and a method that prints the amount of each number found in the 
//array.


public class Sorts {
	public static int mergeSteps= 0;
	public static void main(String[] args) {
		int index = 0;
		int[] arr1 = new int[10000];
		int[] arr2 = new int[10000];
		int[] arr3 = new int[10000];
		//Reads from the csv file
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/Users/SSNMFlex/Downloads/random10k.csv"));
			String line = reader.readLine();
			while (line != null) {
				//System.out.println(line);
				arr1[index] = Integer.parseInt(line);
				arr2[index] = Integer.parseInt(line);
				arr3[index] = Integer.parseInt(line);
				index++;
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//prints the steps and the frequency of each number
		System.out.println("Insertion Sort");
		arr1 = insertionSort(arr1);
		System.out.println("Selection Sort");
		arr2 = selectionSort(arr2);
		System.out.println("Merge Sort");
		arr3 = mergeSort(arr3);
		printNums(arr1);
		System.out.println("done");

	}
	public static int[] selectionSort(int[] numbers) {
		//performs the selection sort method
		int steps = 0;
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
			steps++;
		}
		System.out.println("Steps: " + steps);
		return numbers;
	}
	public static int[] insertionSort(int[] numbers) {
		//performs the insertion sort method
		int steps = 0;
		for (int i = 1; i < numbers.length; i++) {
			int index = i;
			for (int j = i-1; j >= 0 ; j--) {
				if (numbers[index] < numbers[j]) {
					int temp = numbers[index];
					numbers[index] = numbers[j];
					numbers[j] = temp;
					index--;
					steps++;
				}
				else {
					break;
				}
			}
			
			
		}
		
		System.out.println("Steps: " + steps);
		return numbers; 
	}
	public static int[] mergeSort(int[] elements){
	      //performs merge sort
		  mergeSteps = 0;
		  int n = elements.length;
	      int[] temp = new int[n];
	      mergeSortHelper(elements, 0, n - 1, temp);
	      System.out.println("Steps: " + mergeSteps);
	      return elements;
	   }

	   private static void mergeSortHelper(int[] elements,
	                                       int from, int to, int[] temp)
	   {
	       if (from < to)
	       {
	    	  int middle = (from + to) / 2;
	          mergeSortHelper(elements, from, middle, temp);
	          mergeSteps++;
	          mergeSortHelper(elements, middle + 1, to, temp);
	          mergeSteps++;
	          merge(elements, from, middle, to, temp);
	          mergeSteps++;
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
	            mergeSteps++;
	         }
	         else
	         {
	            temp[k] = elements[j];
	            j++;
	            mergeSteps++;
	         }
	         k++;
	      }

	      while (i <= mid)
	      {
	         temp[k] = elements[i];
	         i++;
	         k++;
	         mergeSteps++;
	      }

	      while (j <= to)
	      {
	         temp[k] = elements[j];
	         j++;
	         k++;
	         mergeSteps++;
	      }

	      for (k = from; k <= to; k++)
	      {
	         elements[k] = temp[k];
	         mergeSteps++;
	      }
	   }
	   public static void printNums(int[] arr) {
		   for (int i = 1; i <= 10; i++) {
			   int num = 0;
			   for (int j = 0; j < arr.length; j++) {
				   if (i == arr[j])
					   num++;
			   }
			   System.out.println("There were "+ num + " instances of " + i +" in the array");
		   }
	   }
}
