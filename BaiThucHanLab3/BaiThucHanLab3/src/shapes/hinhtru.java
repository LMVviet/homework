package shapes;
import java.util.Scanner;
public class hinhtru extends hinhtron {
    Scanner sc = new Scanner(System.in);
        public float h;
         
         public hinhtru(){
            ten = "Hinh tru";
         }

        public void nhapChieucao(){
            nhapBanKinh();
            System.out.print("chieu cao = ");
            h = sc.nextFloat();
            sc.close();
        }

        public void tinhTheTich(){
            tinhDienTich();
            TheTich = DienTich * h;
        }

    }
