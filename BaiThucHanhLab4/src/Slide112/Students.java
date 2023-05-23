package Slide112;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    String FullName;
    float point;
    Scanner sc = new Scanner(System.in);

    // NHAP THONG TIN
    public void NhapThongTin(){
        System.out.print("Nhap ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap diem: ");
        point = sc.nextFloat();
        sc.nextLine();
    }

    // HIEN THI THONG TIN
    public void HienThiThongTin(List<Students> stdList ){
        for (int i = 0; i < stdList.size(); i++){
            System.out.println("Sinh vien " + (i +1) + " :"  + stdList.get(i).FullName + " " + stdList.get(i).point +" diem");

        }

    }

    //THEM SINH VIEN
    public void ThemThongTin(List<Students> stdList){
        System.out.println("Nhap so luong sinh vien can them: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien can them: ");
            Students std = new Students();
            std.NhapThongTin();
            stdList.add(std);
            
        }
    }

    // SINH VIEN THI LAI
    public void SVThiLai(List<Students> stdList){
        int soSV =0;
        System.out.println("So sinh vien phai thi lai la: ");
        for(int i = 0; i< stdList.size(); i++){
            if(stdList.get(i).point <= 5){
                soSV++;
                System.out.print("Sinh vien "+ (i+1) +" :");
                System.out.print(stdList.get(i).FullName + " ");
                System.out.print(stdList.get(i).point +" diem");

            }
        }
    }

    // HIEN THI SINH VIEN DIEM CAO NHAT
    public void SVDiemCao(List<Students> stdList){
        Float maxDiem;
        String TenSVMaxDiem;
        maxDiem=stdList.get(0).point;
        TenSVMaxDiem=stdList.get(0).FullName;
        System.out.println();
        System.out.println("Danh sach sinh vien diem cao la:");
        for(int i=0;i<stdList.size();i++){
            if(stdList.get(i).point>maxDiem){
                maxDiem= stdList.get(i).point;
                TenSVMaxDiem=stdList.get(i).FullName;
            }          
        }
        System.out.println("Sinh vien "+ TenSVMaxDiem + " " + maxDiem + " diem" );

    }

    //TIM KIEM SINH VIEN
    public void TimKIemSV(List<Students> stdList){
        String SVCanTim;
        sc.nextLine();
        System.out.print("Nhap ten sinh vien can tim kiem: ");
        SVCanTim= sc.nextLine();
        for(int i=0;i<stdList.size();i++){
            if(SVCanTim.equals(stdList.get(i).FullName)){
                System.out.println("Sinh vien can tim la:");
                System.out.println("Ho va Ten: " + stdList.get(i).FullName);
                System.out.println("Diem: " + stdList.get(i).point);
                return;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Students> stdLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i< n; i++){
            Students std = new Students();
            System.out.println("Nhap sinh vien " + (i+1) + " :");
            std.NhapThongTin();
            if(std.FullName.isEmpty())
            break;
            stdLists.add(std);
        }
        Students std = new Students();
        std.HienThiThongTin(stdLists);
        std.ThemThongTin(stdLists);
        std.HienThiThongTin(stdLists);
        std.SVThiLai(stdLists);
        std.SVDiemCao(stdLists);
        std.TimKIemSV(stdLists);

    }



    
    
}
