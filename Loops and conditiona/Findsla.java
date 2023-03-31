import java.util.*;

public class Findsla {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //find smallest number:
        if(a<b && b<c){
           System.out.println(" The Smallest Number:"+a);
        }
        else if(b<a && b<c)
        {
            System.out.println(" The Smallest Number:"+b);
        }
        else
        {
            System.out.println(" The Smallest Number:"+c);
        }
        //The Largest Number
        if(a>b && b>c){
            System.out.println("The Largest Number:"+a);
         }
         else if(b>a && b>c)
         {
             System.out.println("The Largest Number:"+b);
         }
         else
         {
             System.out.println("The Largest Number:"+c);
         }
        
         //find average number 
         int ans=(a+b+c)/3;
         System.out.println("Average of all three numbers:"+ans);
        sc.close();
    }
}
