// Diberikan sebuah array arr[] dimana kita akan memindahkan array yang angka 0 menjadi kebelakang namun array yang berbeda tetap sama

public class PendekatanNaif {
    // Membuat fungsi untuk memindahkan 0 ke bagian belakang array
    static void pindahkanNolKeBelakang(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];

        // Melacak indeks di temp[]
        int j = 0;

        // Salin elemen yang bukan Nol ke array sementara temp[]
        for (int i = 0; i < n; i++){
            if (arr[i] != 0)
            temp[j++] = arr[i];
        }

        // Isi posisi dari name array sementara temp[] dengan Nol
        while (j < n)
        temp[j++] = 0;

        // Setelah di gabungkan salin array semua elemen yang ada di array sementara temp[] ke array asli arr[]
        for (int i = 0; i < n; i++)
        arr[i] = temp[i];
    }

    static public void main (String[] args)
    {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pindahkanNolKeBelakang(arr);

        // Print array yang di modifikasi
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}