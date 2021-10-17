import java.util.Arrays;

public class Driver {

	private static long startTime;

	public static void main(String args[]) {
		int[] test = new int[8000];
		
		for ( int i = 0; i < test.length; i++) {
			test[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(test)); //print out array before sorting
		startTime = System.currentTimeMillis();
		selectionSort(test);
		
		System.out.println(System.currentTimeMillis()-startTime);
		
		System.out.println(Arrays.toString(test)); //prints out array after calling bubbleSort
		
		}
	
    public static void bubbleSort(int[] arr) {

        //write a loop to visit element i and i+1

        int temp;
        for ( int total = 0; total < arr.length - 1; total++) {

        for ( int i = 0; i < arr.length - 1; i++) {
            if ( arr[i] > arr[i+1]) {

                //swap them ( 3 lines )

                temp = arr[i]; //move the element at i
                arr[i] = arr[i+1]; //move i+1 element to i
                arr[i+1] = temp; //move temp to i+1

            }
            }
        }

    }
	
	public static void insertionSort(int[] elements)
	   {
	      for (int j = 1; j < elements.length; j++)
	      {
	         int temp = elements[j];
	         int possibleIndex = j;
	         while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
	         {
	            elements[possibleIndex] = elements[possibleIndex - 1];
	            possibleIndex--;
	         }
	         elements[possibleIndex] = temp;
	      }
	  }

	public static void selectionSort(int[] elements)
	   {
	      for (int j = 0; j < elements.length - 1; j++)
	      {
	         int minIndex = j;
	         for (int k = j + 1; k < elements.length; k++)
	         {
	            if (elements[k] < elements[minIndex])
	            {
	               minIndex = k;
	            }
	         }
	         int temp = elements[j];
	         elements[j] = elements[minIndex];
	         elements[minIndex] = temp;
	       }
	   }


}
