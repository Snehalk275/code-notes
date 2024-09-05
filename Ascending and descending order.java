import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int arr[] = new int[n];
        
        // Taking array elements input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Making a copy of the original array for descending sort later
        int originalArr[] = arr.clone();
        
        // Sort in ascending order
        sortAscending(arr);
        System.out.println("Sorted array (Ascending order):");
        printArray(arr);
        
        // Reset array to original and sort in descending order
        arr = originalArr.clone();
        sortDescending(arr);
        System.out.println("Sorted array (Descending order):");
        printArray(arr);

        scanner.close(); // Close the scanner to prevent resource leak
    }

    // Function to sort array in ascending order using Selection Sort
    public static void sortAscending(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    // Swap arr[i] and arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Function to sort array in descending order using Selection Sort
    public static void sortDescending(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    // Swap arr[i] and arr[j]
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Function to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line
    }
}
