// Diberikan sebuah arr[] cetaklah setiap elemen alternatif nya dari array tersebut dimulai dari indeks yang pertama
// Idenya kita akan memulai iterasi dari index 0 dan di cetak langsung kemudian kita akan mengabaikan index berikutnya karena kita akan menambahkan 2 index setelahnya
// Menggunakan pendekatan iteratif

import java.util.*;

class ContohArrayAlternativ {
    static ArrayList<Integer> getAlternatif(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        // Kita akan membuat loop untuk setiap elemen sampai akhir elemen
        for (int i = 0; i < arr.length; i += 2) {
            res.add(arr[i]);
        }

        return res;
    }

    public static void main (String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 120};
        ArrayList<Integer> res = getAlternatif(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}