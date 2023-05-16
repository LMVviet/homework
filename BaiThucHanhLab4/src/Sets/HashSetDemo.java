package Sets;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    
    public static void main(String[] args) {
        HashSet<Student> hastSet=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n;
        Student student = new Student();
        System.out.print("Nhap vao so luong sinh vien: ");
        n=sc.nextInt();
        //Nhap 
        for(int i=0;i<n;i++){
            Student std = new Student();
            System.out.println("Nhap sinh vien thu "+ (i+1)+":");

            std.NhapThongTin();
            hastSet.add(std);
        }
        //hien thi
        student.HienThiThongTin(hastSet);
        //them moi
        student.AddThongTin(hastSet, n);
        //hien thi
        student.HienThiThongTin(hastSet);
        //chinh sua thong tin
        student.SuaThongTin(hastSet);
        //hien thi
        student.HienThiThongTin(hastSet);
        //xoa
        student.XoaThongTin(hastSet);
        //hien thi
        student.HienThiThongTin(hastSet);
        sc.close();
}
}