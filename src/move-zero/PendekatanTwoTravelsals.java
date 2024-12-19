// Idenya adalah memindahkan semua angka Nol dengan melintasi array dua kali
// 1. Traversal Pertama => Geser elemen bukan nol :
// a. Lintasi array dan pertahankan hitungan elemen bukan nol. Hitungan ini di inisialisasi dengan Nol dan melacak dimana elemen bukan Nol berikutnya harus di tempatkan dalam array
// b. Jika elemen nya bukan 0, letakkan di arr[count] dan tingkatkan count sebesar 1
// c. Setelah melintasi semua elemen, semua elemen yang bukan 0 akan bergeser ke depan sambil mempertahankan urutan aslinya
// 2. Traversal Kedua => Isi posisi yang tersisa dengan angka 0
// a. Setelah penelusuran yang pertama semua elemen yang bukan 0 akan berada di awal array dan hitungan akan menyimpan indeks tempat 0 pertama harus di tempatkan.
// b. Ulangi dari hitungan hingga akhir array dan isi semua indeks nya dengan 0

// Complexitas waktu O(n) karena menggunakan 2 penelusuran dan ruang n(1)

public class PendekatanTwoTravelsals {
    static void pushZeroesToEnd(int[] arr)
    {
        // Jumlah elemen yang bukan nol
        int count = 0;

        // jika elemennya bukan Nol gantilah elemen tersebut
        // di indeks count dengan elemen ini (count) dan jumlah nya di naikan
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
            arr[count++] = arr[i];
        }

        // Sekarang elemen yang bukan Nol telah di pindahkan atau di geser
        // ke depan, jadikan semua elemen 0 dari count hingga akhir
        while (count < arr.length)
        arr[count++] = 0;
    }
    static public void main (String[] args)
    {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeroesToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}