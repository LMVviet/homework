import java.util.ArrayList;
public class Slide16{

    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();

        // thêm các phần tử sử dụng phương thức add()
        arrayListString.add("Java");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");
        //duyệt theo kích thước của arrlistString
        //Sử dụng vòng lập for thông thường
        //phương thức sử dụng arrListString.size() sẽ trả về số phần tử của arrListSring
        //Sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        //sau đó hiển thị giá trị phần tử đó ra
        System.out.println("Cac phan tu co trong arrListSring là: ");
        for (int i = 0; i < arrayListString.size(); i ++)
        { System.out.print(arrayListString.get(i) + "\t");}

    }
}
