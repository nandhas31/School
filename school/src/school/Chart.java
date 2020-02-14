package school;
public class Chart
{
   public static void main(String[] args){
     int[] nums = new int[100];
     for (int i = 0; i < nums.length; i++){
        nums[i] = (int)(Math.random() * 99 )+1;
        }
     nums = selectionSort(nums);
     
     //System.out.print(nums[i] + " ");
     doChart(nums);
    }
   public static void doChart(int[] list){
    int min = 1;
    int max = 10;
    boolean inRange = true;
    int index = 0;
    while(max <= 100){
        System.out.print(min +" - "+ max + " |");
        while (inRange && index < 100){
            if (list[index] >= min && list[index] <= max ){
                System.out.print("*");
                index++;
            }
            else{
                inRange = false;
            }
        }
        System.out.println();
        max += 10;
        min += 10;
        inRange = true;
    }
    
    
    }
    public static int[] selectionSort(int[] numbers) {
      int min, temp;

      for (int index = 0; index < numbers.length-1; index++) {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] < numbers[min])
               min = scan;

         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
      }
      return numbers;
   }
}
