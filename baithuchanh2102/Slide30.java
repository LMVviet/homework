public class TingTong { 
   public static void main(String[] args) {
     int n, soDu;
     int tong = 0;
     Scanner scanner = new Scanner(System.in);
      
     System.out.println(" NhAp vao 1 so nguyen duOng: ");
     n = scanner.nextInt();
     while (n > 0) {
         soDu = n % 10;
         tong += soDu;
         n /= 10;
     }
     System.out.println("tong cac chu so = " + tong);
 }

}