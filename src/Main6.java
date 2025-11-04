import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        int[] mynum = {1, 2, 3, 4, 5};
        List<Integer> arr = new ArrayList<>();
        int n = 3;
        for(int i = n; i < mynum.length; i++ ) {
            arr.add(mynum[i]);

        }
        System.out.println(arr);
    }
}
