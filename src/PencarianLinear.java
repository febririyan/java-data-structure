public class PencarianLinear {
    public static int search(int arr[], int N, int key)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == key)
            return i;
        }
        return -1;
    }

    // Driver code
    public static void main (String[] args)
    {
        // Inisialisasi
        int[] arr = {89, 54, 23, 50, 73, 21};
        int key = 54;

        // Function Call
        int result = search(arr, arr.length, key);
        if (result == -1)
        System.out.print("Elemen tidak ada di array ");

        else
        System.out.print("Elemen ada di temukan di array " + result);
    }
}
