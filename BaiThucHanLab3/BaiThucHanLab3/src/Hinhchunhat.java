import java.util.Scanner;
public class Hinhchunhat {
        Scanner sc = new Scanner(System.in);
        float dai, rong;
        float Chuvi;
        float Dientich;
        void nhapThongtin(){
            System.out.print("Nhap chieu dai: " );
            Scanner sc = new Scanner(System.in);
            dai = sc.nextFloat();
            System.out.print("Nhap chieu rong: ");
            rong = sc.nextFloat();
            sc.close();
        }
        void tinhChuvi() { 
            Chuvi = 2*dai + 2*rong;
        }
        void inChuvi(){
            System.out.println("Chu vi hinh chu nhat = " + Chuvi);
        }
        void tinhDientich(){
            Dientich = dai * rong;
        }
        void inDientich(){
            System.out.println("Dien tich hinh hinh chu nhat = " + Dientich);
        }
        

    public static void main(String[] args) {
     Hinhchunhat ht = new Hinhchunhat();
     ht.nhapThongtin();
     ht.tinhChuvi();
     ht.inChuvi();
     ht.tinhDientich();
     ht.inDientich();
    }
}