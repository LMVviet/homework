import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        int number, n = 1;
        int GT = 1;
         
        Scanner sc = new Scanner(System.in);
         
        do {
            System.out.println("Nhap 1 so: ");
            number = sc.nextInt();
        } while (number <= 0);
         
        while (n <= number) {

            GT *= n;
            n++;
        }
         
        System.out.println(number + "! = " + GT);
        sc.close();
    }
 
}
