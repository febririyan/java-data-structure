public class PassingArrayMethod {
    static public void main(String[] args)
    {
        // Kita akan menggunakan passing array dimana array dapat di teruskan ke metode
        int myArray[] = {4, 7, 4, 6, 8, 9, 10};
        
        sum(myArray);
    }

    static public void sum (int[] myArray)
    {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++)
        sum += myArray[i];

        System.out.println("Hasil penjumlahan array = " + sum);
    }
}
