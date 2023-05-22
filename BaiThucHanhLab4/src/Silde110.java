import java.util.ArrayList;
import java.util.Scanner;

public class Silde110 {
    ArrayList<Integer> SList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int number; //phan tu cua mang

        public void NhapPhanTu(){
        System.out.print("Nhap so luong phan tu cho mang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + " : ");
            number = sc.nextInt();
            SList.add(number);

        }            
    }

        public void HienThi(){
            System.out.println("Cac so da nhap la:" );
            for(int i = 0; i < SList.size(); i++){
                System.out.println(SList.get(i));
            }

    }
        
        //    MAX
        public void GTLN(){
            SList.sort(null); 
        for(int i=0; i<SList.size(); i++){
            if(i == SList.size()-1)
            System.out.println("Gia tri MAX la:  " + SList.get(i));
        }
    }
         //  XOA PHAN TU TRONG MANG
        public void XoaPhantu(){
            System.out.print("Nhap so can xoa la: ");
             int socanxoa = sc.nextInt();
        for (int i = 0; i < SList.size(); i++) {
            if (socanxoa == SList.get(i)) {
                SList.remove(i);
                System.out.println("Cac so con lai la: " + SList.get(i));
 
            }
        }
    }
    // SAP XEP
        public void Sapxep(){
            SList.sort(null);
            System.out.print("Sap xep cac so da nhap:"  );
        for (int i = 0; i < SList.size(); i++){
            System.out.print("     " + SList.get(i));
        }
        }



public static void main(String[] args) {
    Silde110 Sl =new Silde110();
    Sl.NhapPhanTu();
    Sl.HienThi();
    Sl.GTLN();
    Sl.XoaPhantu();
    Sl.Sapxep();

    }
    
}