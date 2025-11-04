import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] myarr = {4, 9, 1, 7, 3};
        Arrays.sort(myarr);
        System.out.println("Deuxième plus grand : " + myarr[myarr.length - 2]);
    }
}


