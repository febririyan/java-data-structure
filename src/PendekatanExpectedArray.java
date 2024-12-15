// Ini yang terbaik untuk menemukan cara untuk mencari elemen terbesar ke dua time O(n) dimana hanya melakukan 1 penelusuran atau melintas di data array, ruang space O(1)


public class PendekatanExpectedArray {
    // Membuat fungsi untuk mencari elemen yang terbesar
    static int getSecondLargest (int[] arr) {
        int n = arr.length;

        int largest = - 1, secondLargest = - 1;

        // Menemukan elemen terbesar
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main (String[] args)
    {
        int[] arr = {23, 16, 20, 22, 25};
        System.out.println(getSecondLargest(arr));
    }
}
