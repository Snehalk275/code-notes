import java.util.Arrays;
import java.util.Scanner;

public class sortingalgos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initializing the array
        int[] arr = new int[n];

        // Taking input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting the array using bubble sort
        bubble(arr);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        sc.close();  // Closing the scanner
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
