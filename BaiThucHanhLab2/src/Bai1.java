import java.util.Scanner;
public class Bai1 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.println("Nhap vao a: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao b: ");
        int b = sc.nextInt();
         
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
         
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);

        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);

        float thuong = a / b;  
        System.out.println(a + "/" + b + " = " + thuong );
      
        float duhaiso = a % b;
        System.out.println(a + "/" + b + " du " + duhaiso);

        System.out.println("ket qua so sanh bang 2 so " + a + " va " + 
                b + " la " + (a == b));
        System.out.println("ket qua so sanh khong bang 2 so " + a + " va " + 
                b + " la " + (a != b));
        System.out.println("ket qua so sanh lon hon 2 so " + a + " va " + 
                b + " la " + (a > b));
        System.out.println("ket qua so sanh lon hon hoac bang 2 so " + a + " va " + 
                b + " la " + (a >= b));
        System.out.println("ket qua so sanh nho hon 2 so " + a + " va " + 
                b + " la " + (a < b));
        System.out.println("ket qua so sanh nho hon hoac bang 2 so " + a + " va " + 
                b + " la " + (a <= b));
        sc.close();
    }
 
}

        
        