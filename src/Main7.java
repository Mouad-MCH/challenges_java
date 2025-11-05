import java.util.ArrayList;
import java.util.HashMap;

public class Main7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr2 = {2, 3, 2, 5, 3};
        for(int el : arr2) {
            arr.add(el);
        }

        HashMap<Integer, Integer> obj = new HashMap<>();
        for(int el : arr2) {
            if(obj.containsKey(el)) {
                obj.put(el , obj.get(el) + 1);
            }else{
                obj.put(el,1);
            }
        }

        System.out.println(obj);

    }
}
