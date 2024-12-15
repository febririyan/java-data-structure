import java.util.*;

public class OperationArrayList {
    static public void main (String[] args)
    {
        // Membuat Arraylist
        ArrayList<String> al = new ArrayList<>();

        // Menambahkan elemen ke dalam arraylist
        al.add("Febry");
        al.add("Liana");
        al.add("Budi");

        System.out.println("Original elemen list : " + al);

        // Menambahkan element untuk spesifik index
        al.add(1, "Farhana");

        System.out.println("Setelah di tambahkan elemen dengan index 1 " + al);

        // Menghapus elemen menggunakan index
        al.remove(0);

        System.out.println("Setelah index 0 di hapus " + al);

        // Bisa juga menghapus menggunakan value nya
        al.remove("Budi");

        System.out.println("Setelah menghapus menggunakan value " + al);

        // Mengupdate value nya juga dengan menggunakan index
        al.set(0, "Budiana");

        System.out.println("Setelah di update atau ganti value nya " + al);

        // Print semua elemen di dalam ArrayList
        System.out.println("Daftar setelah update nilainya " + al);
    }
}
