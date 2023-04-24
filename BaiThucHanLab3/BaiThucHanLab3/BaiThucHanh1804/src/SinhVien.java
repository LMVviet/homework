
import java.util.Scanner;

public class SinhVien {
    Scanner scanner=new Scanner(System.in);
    String name;
    String nganh;
    int nien_khoa;
    String class_name;
    //Nhap 
    void NhapTen(){
        System.out.print("Nhap Ho va Ten: ");
        name=scanner.nextLine();
    }
    void NhapNganh(){
        System.out.print("Nhap Nganh: ");
        nganh=scanner.nextLine();
    }
    void NhapNienKhoa(){
        System.out.print("Nhap nien khoa: ");
        nien_khoa=scanner.nextInt();
        scanner.nextLine();
    }
    void NhapTenLop(){
        System.out.print("Nhap Lop: ");
        class_name=scanner.nextLine();
    }

    //In
    void InLop(){
        System.out.print("\nLop: "+class_name);
    }
    void InHoTen(){
        System.out.print("\nHo va Ten: "+name);
    }
    void InNganh(){
        System.out.print("\nNganh: "+nganh);
    }
    void InNien_Khoa(){
        System.out.print("\nNien khoa: "+nien_khoa);
    }
}