public class TInhtong {
 
    public static void main(String[] args) {
        int number, balance;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("nhap vao 1 so nguyen duong: ");
        number = scanner.nextInt();
         
        while (number <= 0) {
            System.out.println("so nhap phai lon hon 0");
            number = scanner.nextInt();
        }
         
        while (number > 0) {
            balance = number % 10;
            sum += balance;
            number /= 10;
        }
         
        System.out.println("tong cac chu so = " + sum);
    }
 
}