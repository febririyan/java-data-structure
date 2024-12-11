public class KonversiNumber {
    public static void main ()
    {
        // Melakukan konversi Tipe Data Number
        byte iniByte = 90;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Ketika konversi yang besar ke kecil harus hati hati
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt;
    }
}
