package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> stdLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student std = new Student();

        System.out.print("Nhap vao so sinh vien: ");
        int n = sc.nextInt();

        // Them thong tin
        std.AddThongTin(stdLists, n);

        // Hien thi du lieu
        std.HienThiThongTin(stdLists);

        // Sua Thong Tin
        std.SuaThongTin(stdLists);

        // Xoa Thong Tin
        std.XoaThongTin(stdLists);
        sc.close();
    }
}