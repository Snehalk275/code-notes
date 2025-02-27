import java.util.Scanner;
public class fibonaci{
   public static void main(String [] args){
    int number,t1=0,t2=1,nextterm;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextInt();
        sc.close();
        for(int i=1;i<=number;i++){
            System.out.printf("%d",t1);
            nextterm=t1+t2;
            t1=t2;
            t2=nextterm;
        }

        
       
        }

        }
        

   

    

    