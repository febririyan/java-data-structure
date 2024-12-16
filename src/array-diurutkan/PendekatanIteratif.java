// Disini dimana kita akan melihat apakah sebuah array itu di urutkan 

// Diberikan sebuah array arr[] yang berukuran n Periksa apakah array tersebut diurutkan dalam urutan menaik atau menurun jika nilai array nya ada yang sama maka nilai tersebut boleh di urutkan

public class PendekatanIteratif {
    // Kita akan membuat fungsi jika array yang tidak menurun itu akan bernilai true
    static boolean arraySortedOrNot(int arr[], int n)
    {
        // Array yang memiliki elemen atau tidak memiliki elemen
        if (n == 0 || n == 1)
        return true;

        // Kita buat for loop
        for (int i = 1; i < n; i++)

        // Jika pasangan yang di urutkan tidak di temukan
        if (arr[i - 1] > arr[i])
        return false;

        return false;

    }

    // Driver code
    static public void main (String[] args) {
        int[] arr = {20, 23, 23, 45, 78, 88};
        int n = arr.length;

        if (arraySortedOrNot(arr, n))
        System.out.println("Yes");

        else
        System.out.println("No");

    }
}
