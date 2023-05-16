package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> stdLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Student std = new Student();

        System.out.print("Nhap vao so hoc sinh: ");
        int n = sc.nextInt();
        sc.close();

        // Them thong tin
        std.Add(stdLists, n);

        // Hien thi du lieu
        std.HienThi(stdLists);

        // Sua Thong Tin
        std.SuaThongTin(stdLists);

        // Xoa Thong Tin
        std.XoaThongTin(stdLists);

    }
}