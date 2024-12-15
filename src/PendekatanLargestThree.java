// Cara mencari elemen array terbesar tiga dengan melakukan pendekatan yang efesien
// Rules :
// 1. Apabila x lebih besar dari yang pertama maka perbaharui yang pertama menjadi x, dan yang kedua sebagai yang pertama dan yang ketiga sebagai yang kedua
// 2. Apabila x lebih besar yang ke dua maka perbaharui yang kedua menjadi x, dan yang pertama tidak sama maka yang ketiga menjadi yang ke dua
// 3. Apabila x lebih besar yang ke tiga maka perbaharui yang ke tiga menjadi x, dan tidak sama dengan pertama dan kedua

/* Compleksitas waktu O(n) Ruang Bantu O(1) */

import java.util.*;

public class PendekatanLargestThree {
    static public List<Integer> get3Largest(int[] arr)
    {
        int fst = Integer.MIN_VALUE, sec = Integer.MIN_VALUE, thd = Integer.MIN_VALUE;

        for (int x : arr) {
            // Jika elemen x lebih besar dari yang pertama
            if (x > fst) {
                thd = sec;
                sec = fst;
                fst = x;
            }

            // Jika elemen x lebih besar dari yang kedua
            else if (x > sec && x != fst) {
                thd = sec;
                sec = x;
            }
            else if (x > thd && x != sec && x != fst) {
                thd = x;
            }
        }

        List<Integer> res = new ArrayList<>();
        if (fst == Integer.MIN_VALUE) return res;
        res.add(fst);
        if (sec == Integer.MIN_VALUE) return res;
        res.add(sec);
        if (thd == Integer.MIN_VALUE) return res;
        res.add(thd);

        return res;
    }

    static public void main (String[] args)
    {
        // Masukkan inisialisasi array
        int[] arr = {23, 20, 40, 25, 30, 26, 27};
        List<Integer> res = get3Largest(arr);
        for (int x : res){
            System.out.print(x + " ");
        }

        System.out.println();
    }
}