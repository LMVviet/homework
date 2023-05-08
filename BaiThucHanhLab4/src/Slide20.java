import java.util.ArrayList;
import java.util.Scanner;

public class Slide20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu trong arrlist: ");
        ArrayList<Integer> arrayList=new ArrayList<>();
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("Nhap phan tu thu %d: ",i+1);
            Integer element=scanner.nextInt();
            arrayList.add(element);          
        }
        System.out.println("Cac Phan tu trong arrlist la: ");
        for(Integer aInteger:arrayList){
            System.out.println(aInteger);
        }
        System.out.println("So luong phan tu trong arrlist la: " + arrayList.size());
        scanner.close();
    }
}
    

