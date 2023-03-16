import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        int n, tong = 0, number;
        float TBC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cac so nguyen can tinh:");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Nhap vao so nguyen " + i + ":");
            number = sc.nextInt();
            tong += number;
        }
        TBC = tong / n;
        System.out.println("trung binh cong cua cac so da nhap la: " + TBC);
        sc.close();

    }
    
}
