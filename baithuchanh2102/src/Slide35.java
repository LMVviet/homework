import java.util.Scanner;
public class Slide35 {
   public static void main(String[] args){ 
      Scanner scanner=new Scanner(System.in);
         int a,b; 
         int min =0; 
      System.out.println('Nhap so nguyen a =');
           a = scanner.nextInt();
      System.out.println('Nhap so nguyen b =');
           b = scanner.nextInt();
      if (a>b)
         min = b;
      else
         min = a;
      System.out.println(("Min la:"+min));
   }
}