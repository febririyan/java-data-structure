public class PnedekatanRekursif {
    // Membuat function untuk nilai yang tidak menurun maka di berikan nilai true
    static boolean arraySortedOrNot(int arr[], int n)
    {
        // Case base
        if (n == 0 || n == 1)
        return true;

        // Periksa apakah ada indeks dan indeks
        // Sebelumnya dalam urutan yang benar
        // dan array lainnya di urutkan
        // jika benar maka kembalikan benar true jika tidak maka kembalikan false
        return arr[n - 1] >= arr[n - 2] && arraySortedOrNot(arr, n - 1);
    }

    public static void main (String[] args)
    {
        int[] arr = {20, 23, 23, 45, 78, 88};
        int n = arr.length;

        // Kembalikan fungis
        if (arraySortedOrNot(arr, n))
        System.out.print("Yes");
        else
        System.out.print("No");
    }
}