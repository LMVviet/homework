import java.util.ArrayList;
import java.util.ListIterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList=new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
        ListIterator<Character> listIterator=arrayList.listIterator();
        System.out.println("Cac phan tu trong arrlist la: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}