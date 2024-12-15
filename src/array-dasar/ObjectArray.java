class Siswa {
    public int nomor_siswa;
    public String nama;

    Siswa (int nomor_siswa, String nama)
    {
        this.nomor_siswa = nomor_siswa;
        this.nama = nama;
    }
}

public class ObjectArray {
    static public void main (String[] args)
    {
        // Deklarasi, Inisialisasi, Akses
        Siswa[] myDataSiswa;

        // Kompilasi ke memory
        myDataSiswa = new Siswa[3];

        // Inisialisasi array data nya
        myDataSiswa[0] = new Siswa(1, "Liana");
        myDataSiswa[1] = new Siswa(2, "Burhan");
        myDataSiswa[2] = new Siswa(3, "Kartini");

        // Mengakses array menggunakan for loop
        for (int i = 0; i < myDataSiswa.length; i++)
        System.out.println("Daftar siswa yang lolos " + i + " : " + myDataSiswa[i].nomor_siswa + " " + myDataSiswa[i].nama);
    }
}