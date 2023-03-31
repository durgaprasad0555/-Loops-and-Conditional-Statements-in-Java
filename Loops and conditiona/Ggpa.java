import java.util.*;



public class Ggpa{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Marks Obtained by a Student:");
        int n=sc.nextInt();
        System.out.print("Total Marks: ");
        int m=sc.nextInt();
        float a=(float)(n*100.00/m);
        
        if(a<=59)
        {
            System.out.print("Percentage:");
           
          System.out.format("%.2f",a-0.01);
          System.out.print("%");
          System.out.print("\n");
            System.out.println("Grade F,GPA=0.0");
        }
        else if(a>=60 && a<=69 )
        {
            System.out.print("Percentage:");
            System.out.format("%.2f",a-0.01);
            System.out.print("%");
            System.out.print("\n");
            System.out.println("Grade D,GPA=1.0");
        }
        else if(a>=70 && a<=79)
        {
            System.out.print("Percentage:");
            System.out.format("%.2f",a-0.01);
            System.out.print("%");
            System.out.print("\n");
            System.out.println("Grade C,GPA=2.0");
        }
        else if(a>=80 && a<=89)
        {
            System.out.print("Percentage:");
            System.out.format("%.2f",a-0.01);
            System.out.print("%");
            System.out.print("\n");
            System.out.println("Grade B,GPA=3.0");
        }
        else if(a>=90 && a<=100)
        {
            System.out.print("Percentage:");
            System.out.format("%.2f",a-0.01);
            System.out.print("%");
          System.out.print("\n");
            System.out.println("Grade A,GPA=4.0");
        }

        sc.close();
    }
}