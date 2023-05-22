import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> Slide111 = new LinkedList<>();
        int number;
        int n, tbc;
        int tong = 0, sochuso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang la: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Nhap so thu " + (i +1) + " la: ");
            number = sc.nextInt();
            Slide111.add(number);
        
        if(number % 2 == 0){
            sochuso++;
            tong +=Slide111.get(i);
        }
    }
        tbc = tong/sochuso;
        System.out.println("Trung binh cong cua cac so chan da nhap la: " +tbc);

    sc.close();

    
}
}