import java.util.Scanner;
public class hinhtron {
        Scanner sc = new Scanner(System.in);
        final float pi = 3.14f;
         float r;
         float Chuvi;
         float Dientich;
        void nhapBanKinh(){
            System.out.println("Nhap ban kinh: " );
            Scanner sc = new Scanner(System.in);
            r = sc.nextFloat();
            sc.close();
        }
        void tinhChuvi() { 
            Chuvi = 2 * r * pi;
        }
        void inChuvi(){
            System.out.println("Chu vi hinh tron = " + Chuvi);
        }
        void tinhDientich(){
            Dientich = pi * r * r;
        }
        void inDientich(){
            System.out.println("Dien tich hinh tron = " + Dientich);
        }
        

    public static void main(String[] args) {
     hinhtron ht = new hinhtron();
     ht.nhapBanKinh();
     ht.tinhChuvi();
     ht.inChuvi();
     ht.tinhDientich();
     ht.inDientich();
    }
}