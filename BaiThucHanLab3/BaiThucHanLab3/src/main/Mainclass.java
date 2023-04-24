package main;

import shapes.Hinhvuong;
import shapes.hinhchunhat;
import shapes.hinhtron;
import shapes.hinhtru;

public class Mainclass {

    public static void main(String[] args) {

        //Hình tròn
        hinhtron htron = new hinhtron();
        htron.xuatTen();
        htron.nhapBanKinh();
        htron.tinhChuvi();
        htron.tinhDienTich();
        htron.inChuVi();
        htron.inDienTich();   
                 
        //Hình Trụ
        hinhtru htru = new hinhtru();
        htru.xuatTen();
        htru.nhapChieucao();
        htru.tinhTheTich();
        htru.inTheTich();

        //Hình chữ nhật
        hinhchunhat hcn = new hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieuDaiRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        //Hình Vuông
        Hinhvuong hv = new Hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();

    }
    
}
