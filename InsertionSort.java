import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);

		    
		    System.out.print("Enter the number of elements to sort: ");
		    int n = scanner.nextInt();

		    
		    int[] arr = new int[n];

		    
		    System.out.println("Enter the elements: ");
		    for (int i = 0; i < n; i++) {
		      arr[i] = scanner.nextInt();
		    }

		    // Perform insertion sort
		    insertionSort(arr);

		    
		    System.out.println("Sorted array: ");
		    for (int i : arr) {
		      System.out.print(i + " ");
		    }
		    System.out.println();
		  }

		  public static void insertionSort(int[] arr) {
		    int n = arr.length;
		    for (int i = 1; i < n; ++i) {
		      int key = arr[i];
		      int j = i - 1;

		      // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
		      while (j >= 0 && arr[j] > key) {
		        arr[j + 1] = arr[j];
		        j = j - 1;
		      }
		      arr[j + 1] = key;
		    }
		  }



	}

