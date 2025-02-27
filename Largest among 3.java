import java.util.Scanner;
public class swap{
   public static void main(String [] args){
    int n1,n2,n3,largest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no");
        n1=sc.nextInt();
        System.out.println("Enter 2nd no");
        n2=sc.nextInt();
        System.out.println("Enter 3rd no");
        n3=sc.nextInt();
        if(n1>n2&&n1>n3){
        largest=n1;
        System.out.println("largest is n1");}
        else if(n2>n1&&n2>n3){
        largest=n2;
        System.out.println("largest is n2");}
        else {
        largest=n3;
        System.out.println("largest is n3");
        }

        }
        

   }
      

    

    