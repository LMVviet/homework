package shapes;

import java.util.Scanner;

public class hinhchunhat extends Hinhhoc {

Scanner sc = new Scanner(System.in);

        public float dai, rong;

        public void  nhapChieuDaiRong(){
            System.out.println("chieu dai = " );
              Scanner sc = new Scanner(System.in);
                dai = sc.nextFloat();
            System.out.println("chieu rong = ");
                rong = sc.nextFloat();
            sc.close();
}
        public void  tinhChuVi() { 
            ChuVi = 2*dai + 2*rong;
}

        public void  tinhDienTich(){
            DienTich = dai * rong;
}
}
