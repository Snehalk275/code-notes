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

        // Sorting the array using insertion sort
        insertion(arr);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        sc.close();  // Closing the scanner
    }

    static void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Place the key in its correct position
        }
    }
}








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
        insertion(arr);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        sc.close();  // Closing the scanner
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap (arr,j,j-1);
                }
                else{
                    break;
                }
                    // Swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

