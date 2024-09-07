import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reverse the string manually
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // Append each character from the end
        }
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversed);

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
