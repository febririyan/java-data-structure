// Menggunakan pendekatan yang lebih baik dengan melintasi 2 array dimana kita akan mencari elemen terbersar di lintasan pertama kemudian lintasan kedua kita akan mencari elemen terbesar namun kita akan mengabaikan elemen terbesar yang ada di lintasan pertama

public class PendekatanBetterSecondArray {

    // Kita akan membuat fungsi untuk menemukan elemen terbesar
    static int getSecondLargest (int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // Temukan elemen terbesar
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
            largest = arr[i];
        }

        // Temukan elemen terbesar yang kedua nya
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Kembalikan nilai elemen terbesar kedua
        return secondLargest;

    }

    static public void main (String[] args)
    {
        int[] arr = {12, 32, 35, 67, 30, 33};
        System.out.println(getSecondLargest(arr));
    }
}
