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
        
    }

    // HIEN THI THONG TIN
    public void HienThiThongTin(List<Students> stdList ){
        for (int i = 0; i < stdList.size(); i++){
            System.out.println("Sinh vien " + (i +1) + " :"  + stdList.get(i).FullName + " " + stdList.get(i).point +" diem");

        }

    }

    //THEM SINH VIEN
    public void ThemThongTin(List<Students> stdList){
        for(int i = 0; i <stdList.size(); i++){
            System.out.println("Nhap sinh vien can them: ");
            Students std = new Students();
            std.NhapThongTin();
            stdList.add(std);
         
        }
    }

    // SINH VIEN THI LAI
    public void SVThiLai(List<Students> stdList){
        int soSV =0;
        for(int i = 0; i< stdList.size(); i++){
            if(stdList.get(i).point <= 5){
                soSV++;
                System.out.println("So sinh vien phai thi lai la: " + soSV);
                System.out.println("Sinh vien stt "+ (i+1) +":");
                System.out.println(stdList.get(i).FullName);
                System.out.println(stdList.get(i).point);

            }
        }
    }

    // HIEN THI SINH VIEN DIEM CAO NHAT
    public void SVDiemCao(List<Students> stdList){
        Float maxDiem;
        String TenSVMaxDiem;
        maxDiem=stdList.get(0).point;
        TenSVMaxDiem=stdList.get(0).FullName;
        System.out.println("Danh sach sinh vien diem cao la:");
        for(int i=0;i<stdList.size();i++){
            if(stdList.get(i).point>maxDiem){
                maxDiem= stdList.get(i).point;
                TenSVMaxDiem=stdList.get(i).FullName;
            }          
        }
        System.out.println("Ho va ten: "+TenSVMaxDiem);
        System.out.println("Diem "+maxDiem);
    }

    //TIM KIEM SINH VIEN
    public void TimKIemSV(List<Students> stdList){
        String findName;
        System.out.println("Nhap ten sinh vien can tim kiem:");
        findName= sc.nextLine();
        for(int i=0;i<stdList.size();i++){
            if(findName.equals(stdList.get(i).FullName)){
                System.out.println("Sinh vien can tim la:");
                System.out.println("Ho va Ten: " + stdList.get(i).FullName);
                System.out.println("Diem: " + stdList.get(i).point);
                return;
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Students> stdLists = new ArrayList<>();
        Students std = new Students();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        for (int i = 0; i< n; i++){
            System.out.println("Nhap sinh vien " + (i+1) + " :");
            std.NhapThongTin();
            if(std.FullName.isEmpty())
            break;
            stdLists.add(std);
            
            

        }

        std.HienThiThongTin(stdLists);
        std.SVThiLai(stdLists);
        std.SVDiemCao(stdLists);
        std.TimKIemSV(stdLists);

    }



    
    
}
