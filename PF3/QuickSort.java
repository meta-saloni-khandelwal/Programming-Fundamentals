
/**
 * Class name - QuickSort
 * 
 * @version 1.0
 * @author Saloni 
 */

/*
 *  A class to perform quick sort on an array using recursion.
 */
public class QuickSort 
{
	
	/*
	 * @param arr
	 * @param low
	 * @param high
	 * @return index
	 */
	   int partition(int arr[], int low, int high)
	    {
		   /*
		    * Below function choose a pivot number and arrange the array in such a way
		    * that all the numbers less than pivot number are to the left and greater are to 
		    * the right.
		    * The resultant array is sorted using recursion.
		    */
	        int pivot = arr[high]; 
	        int i = (low-1);
	        for (int j = low; j < high; j++)
	        {
	            if (arr[j] <= pivot)
	            {
	                i++;
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	        return i+1;
	    }
	  /*
	   * @param arr
	   * @param low
	   * @param high
	   * @return 
	   */
	   int[] sort(int arr[], int low, int high)
	    {
	        if (low < high)
	        {
	            int pi = partition(arr, low, high);		//Calling partision function
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	        return arr;			//return array after sorting
	    }
}
