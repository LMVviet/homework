
import java.util.ArrayList;
import java.util.Scanner;
public class Test12 {
    Scanner scanner=new Scanner(System.in);
    public String name;
    public float diem;
    //nhap 
    public void NhapThongTin(){
        System.out.print("Nhap Name: ");
        name=scanner.nextLine();
        System.out.print("Nhap Diem: ");
        diem=scanner.nextFloat();
    }
    //hien thi
    public void HienThiThongTin(ArrayList<Test12> stdList){
        System.out.println("\nDanh sach sinh vien trong danh sach la: ");
        for (int i = 0; i < stdList.size(); i++) {
            System.out.printf("Sinh vien thu %d la: ",i+1);
            System.out.println();
            System.out.print("Ho va ten: "+ stdList.get(i).name);
            System.out.println();
            System.out.print("Diem: "+ stdList.get(i).diem);
            System.out.println();
        }
    }
    //dem sinh vien thi lai
    public void Dem(ArrayList<Test12> stdList){
        int count=0;
        System.out.println("Nhung sinh vien co diem <= 5 phai thi lai la:");
        for(int i=0;i<stdList.size();i++){
            if(stdList.get(i).diem <=5){
                count++;
                System.out.println("Sinh vien stt "+ (i+1) +":");
                System.out.println(stdList.get(i).name);
                System.out.println(stdList.get(i).diem);
            }
        }
        System.out.printf("So sinh vien thi lai trong danh sach la: %d", count);
        System.out.println();
    }
    //hien thi sinh vien diem cao nhat
    public void HienThiDiemCao(ArrayList<Test12> stdList){
        Float maxDiem;
        String nameDiemCao;
        maxDiem=stdList.get(0).diem;
        nameDiemCao=stdList.get(0).name;
        System.out.println("Danh sach sinh vien diem cao la:");
        for(int i=0;i<stdList.size();i++){
            if(stdList.get(i).diem>maxDiem){
                maxDiem= stdList.get(i).diem;
                nameDiemCao=stdList.get(i).name;
            }          
        }
        System.out.println("Ho va ten: "+nameDiemCao);
        System.out.println("Diem "+maxDiem);
    }
    //tim kiem sinh vien theo ten
    public void TimKiem(ArrayList<Test12> stdList){
        String findName;
        System.out.println("Nhap ten sinh vien can tim kiem:");
        findName=scanner.nextLine();
        for(int i=0;i<stdList.size();i++){
            if(findName.equals(stdList.get(i).name)){
                System.out.println("Sinh vien ban vua tim co thong tin la:");
                System.out.println("Ho va Ten: " + stdList.get(i).name);
                System.out.println("Diem: " + stdList.get(i).diem);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Test12> stdList = new ArrayList<>();
        int n;  
        Test12 Test12 = new Test12();
        System.out.println("Nhap vao so luong sinh vien: ");
        n=scanner.nextInt();
        //Nhap 
        for(int i=0;i<n;i++){
            Test12 std = new Test12();
            System.out.println("Nhap sinh vien thu "+ (i+1)+":");
            std.NhapThongTin();
            if(std.name.isEmpty())
            break;
            stdList.add(std);
        }
        //hien thi
        System.out.println();
        Test12.HienThiThongTin(stdList);
        //dem
        System.out.println();
        Test12.Dem(stdList);
        //hien thi sinh vien diem cao nhat
        System.out.println();
        Test12.HienThiDiemCao(stdList);;
        //hien thi sinh vien diem cao nhat
        System.out.println();
        Test12.TimKiem(stdList);
     }   
}