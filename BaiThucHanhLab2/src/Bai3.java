import java.util.Scanner;
public class Bai3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age, year;
        String name, ageGroup;
         
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        year = sc.nextInt();
         
        age = 2023 - year;  
        if (age < 16) {
            ageGroup = "tuoi vi thanh nien";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuoi truong thanh";
        } else {
            ageGroup = "gia roi";
        }
         
        System.out.println("ban" + name + " thuoc nhom " + ageGroup);
        sc.close();
    
}
}
