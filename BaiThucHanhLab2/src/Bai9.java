import java.util.Scanner;
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String KyTu;
        int number = 0, ChuHoa = 0, ChuThuong = 0;

        System.out.println("Nhap vao chuoi ky tu bat ky: ");
        KyTu = sc.nextLine();

        for (int i = 0; i < KyTu.length(); i++) {
            if (Character.isLowerCase(KyTu.charAt(i))) {
                ChuThuong++;
            }
            if (Character.isUpperCase(KyTu.charAt(i))) {
                ChuHoa++;
            }
            if (Character.isDigit(KyTu.charAt(i))) {
                number++;
            }
        }
        sc.close();
        System.out.printf("Co %d ky tu viet hoa", ChuHoa);
        System.out.printf("Co %d ky tu viet thuong", ChuThuong);
        System.out.printf("Co %d so", number);
    }
    

}
    

