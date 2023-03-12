import java.util.Scanner;
public class Slide74 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.println("Nhap vao so phan tu cua mang:");
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao gia tri phan tu  cua mang ", i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        sc.close();
        System.out.println("Tong so chan cua mang la: " + sum);

    }
    
}