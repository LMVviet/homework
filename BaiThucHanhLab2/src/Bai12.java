import java.util.Scanner;
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dong, cot, max = 0;

        do {
            System.out.println("Nhap vao so dong cua mang: ");
           dong = sc.nextInt();
        } while (dong <= 0);

        do {
            System.out.println("Nhap vao so cot cua mang: ");
            cot = sc.nextInt();
        } while (cot <= 0);

        int arr[][] = new int[dong][cot];
        for (int i = 0; i <dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.printf("Nhap vao gia tri phan tu cua mang A[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        max = arr[0][0];
        for (int i = 0; i <dong; i++) {
            for (int j = 0; j < cot; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        sc.close();
        System.out.println("Phan tu co gia tri lon nhat trong mang la: " + max);
    }
}

    