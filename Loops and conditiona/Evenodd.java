import java.util.*;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      char ch;
       do{
      System.out.print("Please enter the number: ");
      int n=sc.nextInt();
      if(n%2==0)

      {
        System.out.println("The given number - "+n+" is an EVEN Number");
      }
      else
      {
        System.out.println("The given number - "+n+" is a ODD Number");
      }
      System.out.print("Do you want to Continue:");
      ch=sc.next().charAt(0);

       }while(ch=='y' || ch=='Y' || ch=='n' || ch=='N');
       sc.close();
    }
}
