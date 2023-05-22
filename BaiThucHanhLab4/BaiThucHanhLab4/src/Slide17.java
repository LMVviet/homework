import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Cac phan tu trong arrlist la: ");
        for(Integer aInteger : arrayList){
            System.out.println(aInteger);
        }
    }
}

