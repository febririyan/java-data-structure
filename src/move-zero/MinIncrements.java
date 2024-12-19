// Perhitungannya target nya 63
// 63 - 21 = hasil / k = 6 = 7
// 7 + 5 + 9 + 3

public class MinIncrements {

    // Fungsi untuk menghitung operasi minimum
    static int minOps(int[] arr, int n, int k)
    {
        // Elemen maksimal array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int res = 0;

        // Ulangi untuk semua elemen
        for (int i = 0; i < n; i++) {
            // Perikasalah apakah elemen dapat di samakan dengan
            // maksimal atau tidak, jika tidak maka kembalikan -1
            if ((max - arr[i]) % k != 0)
            return -1;

            // Jika tidak perbaharui res untuk operasi yang di perlukan
            else
            res += (max - arr[i]) / k;
        }

        return res;
    }

    // Driver program
    static public void main(String[] args)
    {
        int[] arr = {21, 33, 9, 45, 63};
        int n = arr.length;

        int k = 6;

        System.out.println(minOps(arr, n, k));
    }
}