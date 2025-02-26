import java.util.Scanner;
public class evenodd{
   public static void main(String [] args){
      int num1,num2,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number for num1");
      num1=sc.nextInt();
      System.out.println("Enter the number for num2");
      num2=sc.nextInt();
      sc.close();
      System.out.printf("Before swapping num1=%d and num2=%d\n",num1,num2);
      temp=num1;
      num1= num2;
      num2=temp;
      System.out.printf("After swapping num1=%d and num2=%d\n",num1,num2);

   }}

      

    

    