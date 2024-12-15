// Kita akan membuat array dan mengikuti 3 langkah dalam membuat array

public class MembuatArray {
    static public void main (String[] args)
    {
        // Langkah pertama akan mendeklarasikan nama variable atau name-var
        int[] myArray;

        // Langkah ke dua akan mengalokasikan array ke memory
        myArray = new int [5];

        // Kemudian kita juga akan menginisialisasi dari variable array kita
        myArray[0] = 10;
        myArray[1] = 90;
        myArray[2] = 563;
        myArray[3] = 534;
        myArray[4] = 32;

        // setelah itu kita akan mengakses array menggunakan for loop
        for (int i = 0; i < myArray.length; i++)
        System.out.println("Elemen yang di index " + i + " : " + myArray[i]);
    }
}