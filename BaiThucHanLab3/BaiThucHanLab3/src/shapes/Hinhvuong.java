package shapes;

import java.util.Scanner;

public class Hinhvuong extends hinhchunhat {

    public Hinhvuong(){
        ten = "Hinh Vuong";
    }

    public void nhapCanh(){
    Scanner sc = new Scanner(System.in);
        System.out.print("canh hinh vuong = ");
        dai = rong = sc.nextFloat();
        sc.close();
}

}