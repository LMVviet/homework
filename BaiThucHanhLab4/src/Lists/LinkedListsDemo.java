package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListsDemo {
    public static void main(String[] args) throws Exception {
        LinkedList<Student> stdLists = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Student std = new Student();

        System.out.print("Nhap vao so hoc sinh: ");
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