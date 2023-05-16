package Lists;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    public String FullName;
    public int Age;

    // Nhap thong tin
    public void NhapThongTin() {
        System.out.print("Nhap ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }

    // Hien thi thong tin
    public void HienThiThongTin(List<Student> stdList) {
        for (int i = 0; i < stdList.size(); i++) {
            System.out.println(stdList.get(i).FullName);
            System.out.println(stdList.get(i).Age);
        }
    }

    // Sua thong tin
    public void SuaThongTin(List<Student> stdList) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        Student std = new Student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdList.set(i, std);
                std.HienThiThongTin(stdList);
            }
        }
    }

    // Xoa thong tin
    public void XoaThongTin(List<Student> stdList) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        Student std = new Student();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdList.remove(i);
                std.HienThiThongTin(stdList);
            }
        }
    }

    // Add
    public void AddThongTin(List<Student> stdList, int n) {
        for (int i = 0; i < n; i++) {
            Student std = new Student();
            std.NhapThongTin();
            stdList.add(std);
        }
    }
}