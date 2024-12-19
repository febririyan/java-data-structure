/* Ide di balik Algoritma Juggling adalah kita dapat memutar semua elemen array menggunakan siklus . Setiap siklus bersifat independen dan mewakili sekelompok elemen yang akan bergeser di antara mereka sendiri selama rotasi. Jika indeks awal siklus adalah i, maka elemen siklus berikutnya akan ada pada indeks (i + d) % n , (i + 2d) % n , (i + 3d) % n ... dan seterusnya hingga kita mencapai kembali indeks i.

Jadi untuk setiap indeks i , kita tahu bahwa setelah rotasi kita akan memiliki arr[(i + d) % n] pada indeks i . Sekarang, untuk setiap indeks dalam siklus, kita akan menempatkan elemen yang seharusnya ada pada indeks tersebut setelah array diputar. */

// Kompleksitas waktu O(n) - Karena setiap siklus bersifat independen dan kita tidak mengunjungi elemen manapun lebih dari satu Ruang bantu O(1)

public class PendekatanJugglingAlgorithm {
    // Function untuk memutar array
    static void rotateArray(int[] arr, int d)
    {
        int n = arr.length;

        // Tangani kasus dimana d > ukuran array nya atau n
        d %= n;

        // Hitung jumlah siklus dalam rotasi
        int cycles = gcd(n, d);

        // Proses setiap siklus
        for (int i = 0; i < cycles; i++) {
            // Elemen awal dari siklus saat ini
            int startEle = arr[i];

            // Mulai index siklus saat ini
            int currIdx = i, nextIdx;

            // Putar elemen hingga kita mencapai awal siklus
            while (true) {
                nextIdx = (currIdx + d) % n;

                if (nextIdx == i)
                break;

                arr[currIdx] = arr[nextIdx];
                currIdx = nextIdx;
            }

            // Salin elemen awal dari siklus saat ini ke elemen terakhir
            arr[currIdx] = startEle;
        }
    }

    // Fungsi untuk menghitung GCD
    static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static public void main (String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        rotateArray(arr, d);

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
