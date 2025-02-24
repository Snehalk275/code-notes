import java.util.Scanner;
public class evenodd{
    public static void main(String [] args){
        int number,remainder;
        System.out.println("pls enter an integer");
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();
        scan.close();
       remainder= number % 2;
       if(remainder==0)
       System.out.println(number+"even");
       else
       System.out.println(number+"odd");

    }
}

