import java.util.Scanner;
class Main{
     public static void main(String[] args){
        int n,rev=0;
        System.out.print("Enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        while(n>0)
        {
          int r=n%10;
          rev=rev*10+r;
           n=n/10;
           System.out.print(r);
        }
     }
   
}
