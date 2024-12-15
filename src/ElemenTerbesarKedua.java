// Menggunakan pendekatan Naif 

import java.util.Arrays;

public class ElemenTerbesarKedua {
    // Fungsi untuk mencari elemen terbesar kedua
    static int getSecondElement(int[] arr) {
        int n = arr.length;

        // Akan mengurutkan array tidak dalam menurun
        Arrays.sort(arr);

        // Dimulai dari elemen dan index ke dua akhir untuk menentukan elemen kedua yang terbesar karena yang tebesar pasti akan di indeks 1
        for (int i = n - 2; i >= 0; i--) {

            // Kembalikan elemen pertama yang tidak sama dengan elemen terbesar
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main (String[] args)
    {
        int[] arr = {12, 45, 70, 3, 2, 5, 56, 68};
        System.out.println("Elemen terbesar kedua dari array adalah " + " : " + getSecondElement(arr));
    }
}