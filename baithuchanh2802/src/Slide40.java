import java.util.Scanner;
public class Slide40 {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap 1 ngay: ");
        day = scanner.nextInt();
        switch(day){
            case 1:
            System.out.println("Hom nay la thu 2");
            break;
            case 2:
            System.out.println("Hom nay la thu 3");
            break;
            case 3:
            System.out.println("Hom nay la thu 4");
            break;
            case 4:
            System.out.println("Hom nay la thu 5");
            break;
            case 5:
            System.out.println("Hom nay la thu 6");
            break;
            case 6:
            System.out.println("Hom nay la thu 7");
            break;
            case 7:
            System.out.println("Hom nay la chu nhat");
            break;
        }
        scanner.close();
    }
    
}
