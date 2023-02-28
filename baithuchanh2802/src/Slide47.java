import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) {
    int sum = 0, number;
    Scanner scanner = new Scanner(System.in);      
    do {
        System.out.println("Nhap vao cac so nguyen =");
        number = scanner.nextInt();
        sum += number;
        if (sum > 100)
            break;
        else
        System.out.println("Hay nhap so co tong cac chu so lon hon 100");
    } 
        while (number > 0);
        
    scanner.close();
    System.out.println("Tong = " + sum);
}
    
}
