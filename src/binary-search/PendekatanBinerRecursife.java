public class PendekatanBinerRecursife {
    // mengembalikan indeks x jika ada di arr[low..high]
    // jika tidak kembalikan -1
    int binarySearch(int[] arr, int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // jika elemen itu ada di tengah sendiri
            if (arr[mid] == x) {
                return mid;
            }

            // jika elemen lebih kecil dari elemen pertengahan
            // maka itu hanya bisa ada di subarray kiri
            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, high, x);
            }
        }
        return -1;
    }

    static public void main (String[] args)
    {
        PendekatanBinerRecursife ob = new PendekatanBinerRecursife();
        int[] arr = {2, 3, 4, 10, 40, 56, 70, 78};
        int n = arr.length;
        int x = 78;
        int hasil = ob.binarySearch(arr, 0, n - 1, x);
        if (hasil == -1) {
            System.out.println("Elemen tidak di temukan");
        } else {
            System.out.println("Elemen di temukan indeks :" + hasil);
        }
    }
}
