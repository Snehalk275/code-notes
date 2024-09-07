import java.util.Scanner;
class Main{
     public static void main(String[] args){
        String str="HELO";
        String result="";
        for (int i=str.length()-1;i>=0;i--)
        result+=str.charAt(i);
        System.out.print("result"+result);}}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

