// Dengan pendekatan iteratif

public class PencarianBinerIteratif {
    int binarySearch(int[] arr, int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Periksa apakah x nya itu ada di elemen tengah
            if (arr[mid] == x) {
                return mid;
            }

            // Jika x nya lebih besar dari elemen tengah, maka abaikan sebelah kirinya jadi kita akan mencari ke kanan
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    static public void main (String[] args)
    {
        PencarianBinerIteratif ob = new PencarianBinerIteratif();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 45, 54, 90};
        int x = 10;
        int hasil = ob.binarySearch(arr, x);

        if (hasil == -1) {
            System.out.println("Hasil pencarian array tidak di temukan ");
        } else {
            System.out.println("Hasil array nya di temukan pada indeks : " + hasil);
        }
    }
}