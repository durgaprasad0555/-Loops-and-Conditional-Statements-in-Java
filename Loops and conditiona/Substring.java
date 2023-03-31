import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int st=sc.nextInt();
        int eg=sc.nextInt();
        System.out.println(str.substring(st,eg+1));
        sc.close();
    }
}
