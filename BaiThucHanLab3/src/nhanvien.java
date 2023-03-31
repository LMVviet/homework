import java.util.Scanner;
public class nhanvien {
    Scanner sc = new Scanner(System.in);
    final int Luongcoban = 1490000;
    String Hoten;
    int Namsinh, luong;
    int Hesoluong;
    
    void nhapHoten(){
        System.out.print("Nhap ho ten cua nhan vien: ");    
            Hoten = sc.nextLine();
    }

    void nhapThongtin(){
        System.out.print("Nhap nam sinh cua nhan vien: "); 
            Namsinh = sc.nextInt();

        System.out.print("Nhap he so luong cua nhan vien: " );
            Hesoluong = sc.nextInt();     
        
            sc.close();
    }
    
    void tinhluong(){
        luong = Hesoluong * Luongcoban;
    }

    void inHoten(){
        System.out.print("Ho ten cua nhan vien la " + Hoten);
    }

    void inNamsinh(){
        System.out.print(" sinh nam " + Namsinh);
    }

    void inHesoluong(){
        System.out.println(" co he so luong la " + Hesoluong);
    }

    void inluong(){
        System.out.println("Luong cua "+ Hoten + " la " + luong);
    }

    public static void main(String[] args) {
        nhanvien nv = new nhanvien();
        nv.nhapHoten();
        nv.nhapThongtin();
        nv.inHoten();        
        nv.inNamsinh();
        nv.inHesoluong();
        nv.tinhluong();
        nv.inluong();
        
       
    }
}
