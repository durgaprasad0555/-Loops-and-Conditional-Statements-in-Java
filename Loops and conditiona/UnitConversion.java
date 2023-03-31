import java.util.*;

public class UnitConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        
        do {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu -");
            int me = sc.nextInt();
            
            switch(me) {
                case 1:System.out.print("Please enter the CM Value: ");
                    double cm = sc.nextDouble();
                    double m = cm / 100;
                    System.out.println(cm + " CM = " + m + " M");
                    break;
                case 2:
                    System.out.print("Please enter the M Value: ");
                    double met = sc.nextDouble();
                    double km = met / 1000;
                    System.out.println(met + " M = " + km + " KM");
                    break;
                case 3:
                    System.out.print("Please enter the KM Value: ");
                    double kms = sc.nextDouble();
                    double mtrs = kms * 1000;
                    System.out.println(kms + " KM = " + mtrs + " M");
                    break;
                case 4:
                    System.out.print("Please enter the M Value: ");
                    double meter = sc.nextDouble();
                    double cms = meter * 100;
                    System.out.println(meter + " M = " + cms + " CM");
                    break;
               
            }
            
            System.out.print("Do you want to Continue: ");
            ch = sc.next().charAt(0);
        } while( ch=='n' || ch=='N' || ch == 'y' || ch== 'Y');
        
        
        sc.close();
    }

}
