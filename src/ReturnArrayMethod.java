public class ReturnArrayMethod {

    // Methode Driver
    static public void main (String[] args)
    {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
    }

    static public int[] m1()
    {
        return new int[] {1, 2, 3};
    }
}
