import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Integer[] arr = {1, 2, 3, null, 4,null, 56, null, 7};
        try{
            main.checkArray(arr);
        }catch(NewException e){
            System.out.println(e.getMessage());
        }
    }

    public void checkArray(Integer[] arr) throws NewException {
        if (arr == null) {
            throw new IllegalStateException("null parameter");
        }
        if (arr.length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        List<Integer> index = new ArrayList<>();
        boolean nullable = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                index.add(i);
                nullable = true;
            }
        }
        if (nullable){
            throw new NewException("Value is null"+ "\nIndex of null values:\t" + index);
        }
    }
}