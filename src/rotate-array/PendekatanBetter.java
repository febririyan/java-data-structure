// Pendekatan ini menggunakan array sementara dengan complex sitas waktu O(n) O(n)
// Dengan ide kita akan menggunakan array sementara yang berukuran n dimana n adalah panjang array asli
// Jika kita memutar elemen ke kiri sebanyan d kali posisinya, elemen n - d terakhir akan berada di depan dan elemen d pertama akan berada di akhir

// Kita salin elemen terakhir n - d dari array asli ke posisi n - d pertama dari array sementara
// lalu salin d elemen pertama dari array asli ke elemen terakhir array sementara
// Salin semua elemen sementara kembali ke array yang asli

public class PendekatanBetter {
    static void putarArray(int[] arr, int d)
    {
        int n = arr.length;

        // Kita akan menggunakan case handel dimana d > n
        d %= n;

        // Simpan array yang diputar ke temporary
        int[] temp = new int[n];

        // salin elemen n - d yang terakhir kedepan di array temp
        for (int i = 0; i < n - d; i++)
        temp[i] = arr[d + i];

        // Salin elemen d nya yang pertama ke akhir di array temp
        for (int i = 0; i < d; i++)
        temp[n - d + i] = arr[i];

        // Salin elemen yang ada di temp ke array asli
        // dan putar array final nya
        for (int i = 0; i < n; i++)
        arr[i] = temp[i];
    }
    static public void main (String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        putarArray(arr, d);

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
