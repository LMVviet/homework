import java.util.Scanner;
public class Slide30 { 
   public static void main(String[] args) {
        int n, soDu;
        int tong = 0;
     try (Scanner scanner = new Scanner(System.in)) {
      System.out.println(" Nhap vao 1 so nguyen duong: ");
           n = scanner.nextInt();
   }
     while (n > 0) {
         soDu = n % 10;
         tong += soDu;
         n /= 10;
     }
     System.out.println("tong cac chu so = " + tong);
 }

}