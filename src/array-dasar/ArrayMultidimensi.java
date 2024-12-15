// Membuat array multidimensi

public class ArrayMultidimensi {
    static public void main (String[] args)
    {
        // Deklarasi array dan inisialisai
        int myArray[][] = {{2, 3, 4, 6}, {6, 7, 8, 7}, {5, 7, 8, 3}, {3, 0, 1, 0}};
        
        // Kita akan langsung melakukan for loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
            System.out.print(myArray[i][j] + " ");

            System.out.println();
        }
    }
}