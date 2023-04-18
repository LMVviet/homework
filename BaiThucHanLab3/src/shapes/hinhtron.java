package shapes;
import java.util.Scanner;
public class hinhtron extends Hinhhoc {
        Scanner sc = new Scanner(System.in);
        public float r;
         public hinhtron(){
            ten = "Hinh tron";
         }
        public void nhapBanKinh(){
            System.out.print("ban kinh = " );
            r = sc.nextFloat();
            sc.close();
        }
        public void tinhChuvi() { 
            ChuVi = 2 * r * PI;
        }
        public void tinhDienTich(){
            DienTich = PI * r * r;
        }
}