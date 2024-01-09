package Assignment1;
import java.util.*;
import java.util.Arrays;
//Bubble sort in Java

public class Bubble {
	
	public static void bubbleSort(int array[]) {
	 int size = array.length;
	 
	 // loop to access each array element
	 for (int i = 0; i < size - 1; i++)
	 
	   // loop to compare array elements
	   for (int j = 0; j < size - i - 1; j++)

	     // compare two adjacent elements
	     // change > to < to sort in descending order
	     if (array[j] > array[j + 1]) {

	       // swapping occurs if elements
	       // are not in the intended order
	       int temp = array[j];
	       array[j] = array[j + 1];
	       array[j + 1] = temp;
	     }
	}

	public static void main(String args[]) {
	   
	 int[] data = { 5, 12,14 ,6,78,19,1,23,26,35,37,7,52,86,47 };
	 
	 // call method using class name
	 Bubble.bubbleSort(data);
	 
	 System.out.println("Sorted Array in Ascending Order:");
	 System.out.println(Arrays.toString(data));
	}
	
}
