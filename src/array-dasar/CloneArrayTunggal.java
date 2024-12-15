public class CloneArrayTunggal {
    static public void main (String[] args)
    {
        int myArray[] = {3, 7, 9, 4, 6};

        int cloneArray[] = myArray.clone();

        // will print false as shallow copy is created
        System.out.println(myArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++)
        System.out.print(cloneArray[i] + " ");

    }
}
