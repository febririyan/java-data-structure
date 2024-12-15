// Mencari elemen terbesar di dalam array [50, 90, 20] lalu kita akan melakukan pendekatan iteratif dengan menelusuri elemen dan mendapatkan nilai maksimumnya

public class ElemenTerbesarArray {
    static int myArray[] = {20, 67, 90, 23, 63};

    // kita akan membuat method
    static int nilaiTerbesar()
    {
        // Menginisialisasi elemen maximum
        int max = myArray[0];

        // Melakukan penelusuran dari setiap elemennya
        for (int i = 0; i < myArray.length; i++)
        if (myArray[i] > max)
        max = myArray[i];
        return max;
    }

    static public void main (String[] args)
    {
        System.out.print("Maka nilai maksimum nya " + nilaiTerbesar());
    }
    
}
