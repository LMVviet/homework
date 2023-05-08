import java.util.ArrayList;
import java.util.Iterator;

public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(1.2f);
        arrayList.add(2.2f);
        arrayList.add(3.2f);
        arrayList.add(4.2f);
        Iterator<Float> iterator=arrayList.iterator();
        System.out.println("Cac phan tu trong arrlist la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}