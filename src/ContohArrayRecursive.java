
import java.util.ArrayList;

public class ContohArrayRecursive {
    static void getAlternatesRec(int[] arr, int idx, ArrayList<Integer> res) {
        if (idx < arr.length) {
            res.add(arr[idx]);
            getAlternatesRec(arr, idx + 2, res);
        }
    }

    static ArrayList<Integer> getAlternates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        getAlternatesRec(arr, 0, res);
        return res;
    }

    static public void main (String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> res = getAlternates(arr);
        for (int a : res) {
            System.out.print(a + " ");
        }
    }
}
