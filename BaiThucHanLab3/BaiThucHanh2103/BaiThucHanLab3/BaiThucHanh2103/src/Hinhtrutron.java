import java.util.Scanner;
public class Hinhtrutron {
    Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
         float r,h;
         float Chuvi;
         float Dientich;
         float Thetich;
        void nhapBanKinh(){
            System.out.print("Nhap ban kinh: ");
            r = sc.nextFloat();
            System.out.print("Nhap chieu cao: ");
            h = sc.nextFloat();
            sc.close();
        }
        void tinhChuvi() { 
            Chuvi = 2 * r * pi;
        }
        void inChuvi(){
            System.out.println("Chu vi hinh tru tron = " + Chuvi);
        }
        void tinhDientich(){
            Dientich = pi * r * r;
        }
        void inDientich(){
            System.out.println("Dien tich hinh tru tron = " + Dientich);
        }
        void tinhthetich(){
            Thetich = pi*r*r*h;
        }
        void inThetich(){
            System.out.println("The tich hinh tru tron = " + Thetich);
        }
        

    public static void main(String[] args) {
     Hinhtrutron htt = new Hinhtrutron();
     htt.nhapBanKinh();
     htt.tinhChuvi();
     htt.inChuvi();
     htt.tinhDientich();
     htt.inDientich();
     htt.tinhthetich();
     htt.inThetich();
    }
}
