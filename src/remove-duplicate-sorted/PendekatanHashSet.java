
import java.util.HashSet;

// Diberikan array dimana ada beberapa elemen itu sama maka buatlah berbeda dari elemen tersebut contoh arr[1, 2, 2, 2, 3, 4, 5] maka output 1, 2, 3, 4, 5

public class PendekatanHashSet {
    static int removeDuplicates(int[] arr)
    {
        // Untuk melacak elemen yang terlihat
        HashSet<Integer> s = new HashSet<>();

        // Pertahankan ukuran array yang baru
        int idx = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }

        return idx;
        
    }
    static public void main (String[] args)
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicates(arr);

        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}