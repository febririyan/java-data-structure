
// Complexitas waktu 0(n) karena kita hanya melintasi elemen array hanya 1 kali runang bantu O(1)

public class PendekatanOneTraversals {
    // fungsi yang mendorong angka Nol ke bagian akhir array
    static void pushZeroToEnd(int[] arr)
    {
        // Petunjuk untuk melacak posisi elemen bukan nol berikutnya
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Tukar elemen saat ini dengan 0 di indeks count
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Pindahkan penunjuk count ke posisi berikutnya
                count++;
            }
        }

    }
    static public void main (String[] args)
    {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeroToEnd(arr);

        for (int num : arr)
        System.out.print(num + " ");
    }
}
