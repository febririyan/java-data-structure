public class ElemenTerbesarRecursing {
    // Fungsi untuk menemukan elemen terbesar array

    public static int elemenTerbesar(int[] arr, int i)
    {
        // indeks terakhir kita mengembalikan elemen
        if (i == arr.length - 1) {
            return arr[i];
        }

        // Temukan nilai maksimum dari sisa array
        int recMax = elemenTerbesar(arr, i + 1);

        // Bandingkan dengan elemen ke-i dan kembalikan
        return Math.max(recMax, arr[i]);
    }

    public static void main (String[] args)
    {
        int[] arr = {20, 40, 50, 100};
        System.out.println("Nilai array terbesar " + elemenTerbesar(arr, 0));

    }
}
