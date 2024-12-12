// Cara menggunakan Object array untuk menyimpan data dari object

class Student {
    public int roll_no;
    public String name;

    Student (int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

}

public class ObjectArray {
    static public void main (String[] args)
    {
        // Dalam membuat array ada 3 langkah pertama kita akan mendeklarasikan, inisialisasi, dan mengakses array

        // Mendeklarasikan array
        Student[] myDataStudent;

        // Mengalokasikan array ke memory
        myDataStudent = new Student[5];

        // Menginisialisasi dari array nya
        myDataStudent[0] = new Student(1, "Kasmono");
        myDataStudent[1] = new Student(2, "Martono");
        myDataStudent[2] = new Student(3, "Kartika");
        myDataStudent[3] = new Student(4, "Tragedi");
        myDataStudent[4] = new Student(5, "Sartono");

        // Setelah itu kita akan mengakses object array menggunakan for loop java
        for (int i = 0; i < myDataStudent.length; i++)
        System.out.println("Nama Student adalah " + i + " : " + myDataStudent[i].roll_no + " " + myDataStudent[i].name);
    }
}