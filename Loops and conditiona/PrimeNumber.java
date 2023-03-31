import java.util.*;
public class PrimeNumber{
    public static boolean isprime(int n){
        if(n<=1)
        {
            return false;
        }
        int k=(int)Math.sqrt(n)+1;
        for(int i=2;i<=k;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)==true)
        {
            System.out.println("The given number "+n+" is a Prime number");
        }
        else{
            System.out.println("The given number "+n+" is NOT a Prime number");
        }
        sc.close();
    }
}