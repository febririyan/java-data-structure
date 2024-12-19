// Dibutuhkan sebuah array berukuran n buatlah array tersebut berputar ke kiri berlawanan dari arah jarum jam
// O(n*d) ruang O(1)

public class PendekatanNaif {
    // Membuat function memutar elemen sebanyak d posisi
    static void putarArray(int[] arr, int d)
    {
        int n = arr.length;

        // Ulangi puteran d kali
        for (int i = 0; i < d; i++) {
            // Putar array ke kiri sebanyak satu kali posisi
            int frist = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = frist;
        }
    }
    public static void main (String[] args)
    {
        int[] arr = {2, 3, 4, 1, 9, 0};
        int d = 2;

        putarArray(arr, d);

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }
}
