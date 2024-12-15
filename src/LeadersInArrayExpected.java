
import java.util.ArrayList;
import java.util.Collections;



// Mencari pemimpin dari array menggunakan pendekatan yang di harapkan O(n) dan O(1)

// Untuk memindai semua elemen dari kanan ke kiri dalam array dan melacak nilai maksimum hingga saat ini, jika nilai maksimum nya itu berubah, tambahkan ke hasil dan terakhir bailikkan hasilnya

public class LeadersInArrayExpected {
    // Membuat function untuk menemukan pemimpin
    static ArrayList<Integer> leaders(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // Memulai dengan elemen sebelah kanan
        int maxRight = arr[n - 1];

        // Elemen kanan akan menjadi pemimpin
        result.add(maxRight);

        // telusuri array dari kanan ke kiri
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);

        return result;
    }

    static public void main (String[] args)
    {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr);

        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}