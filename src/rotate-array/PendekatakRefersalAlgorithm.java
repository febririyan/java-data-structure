public class PendekatakRefersalAlgorithm {
    // Membuat fungsi untuk membalikkan array ke kiri
    static void rotateArray(int[] arr, int d)
    {
        int n = arr.length;

        // Membuat base untuk d > dari ukuran array nya
        d %= n;

        // Memutar d di elemen yang pertama
        reverse (arr, 0, d - 1);
        reverse (arr, d, n - 1);
        reverse (arr, 0, n - 1);
    }

    // Membuat fungsi untuk membalikkan sebagian array
    static void reverse(int[] arr, int start, int end) {
        // Ulangi mulai < end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main (String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        rotateArray(arr, d);

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
