public class twodsubarray{
    public static void main(String[] args){
        int a[]={0,1,2,3};
        int n = a.length;
        for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++)
           for(int k=0;k<=i+j;k++)
           System.out.println(a[k]+"");
        }
        System.out.println();
           }



    }
