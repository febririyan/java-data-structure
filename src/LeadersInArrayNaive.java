
import java.util.ArrayList;

// Ada sebuah array kosong di mana kita akan mencari pemimpin dari array nya

// Untuk pendekatan naive kita akan menggunakan 2 loop, yang akan berjalan dari 0 sampai ukuran -1 dan satu persatu mengambil elemen dari kiri ke kanan. Loop akan membandingkan elemen yang di pilih dengan semua elemen yang ada di sebelah kanannya, jika elemen yang di pilih itu lebih besar dari semua elemen sebelah kanannya, maka elemen yang di pilih itu pemimpinnya.

public class LeadersInArrayNaive {
    // Kita akan membuat function mencari elemen pemimpinnya
    static ArrayList<Integer> leaders(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j;

            // Cek elemen sebelah kanan
            for (j = i + 1; j < n; j++) {

                // Jika tidak di temukan elemen yang lebih besar
                if (arr[i] < arr[j])
                break;
            }
            // Jika tidak di temukan elemen terbesar
            if (j == n)
            result.add(arr[i]);
        }

        return result;
    }

    public static void main (String[] args)
    {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leaders(arr);

        for (int res : result) {
            System.out.print(res + " ");
        }

        System.out.println();
    }
}