import java.util.Scanner;
public class Bai2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so can kiem tra: ");
        int n = sc.nextInt();
    if (n % 2 == 0 )
    {
        System.out.println("Day la so chan");
    }
    else
    {
        System.out.println("Day la so le");
    }
    sc.close();

}
}