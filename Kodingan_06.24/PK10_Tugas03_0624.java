package pk10_tugas03_06.pkg24;

/**
 * menentukan angka sempurna
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0624 
{
    // Metode untuk menentukan apakah sebuah angka adalah angka sempurna
    public static boolean isPerfect(int number)
    {
        int sum = 0;

        // Menghitung jumlah faktor dari angka (tidak termasuk angka itu sendiri)
        for (int i = 1; i <= number / 2; i++) 
        {
            if (number % i == 0) 
            {
                sum += i;
            }
        }

        // Jika jumlah faktor sama dengan angka, maka angka tersebut sempurna
        return sum == number;
    }

    // Metode untuk menampilkan faktor-faktor dari angka sempurna
    public static void displayFactors(int number) 
    {
        System.out.print("Faktor dari " + number + " adalah: 1");
        for (int i = 2; i <= number / 2; i++) 
        {
            if (number % i == 0) 
            {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        System.out.println("Angka sempurna antara 1 dan 1000:");

        // Menampilkan semua angka sempurna antara 1 dan 1000
        for (int i = 1; i <= 1000; i++) 
        {
            if (isPerfect(i)) 
            {
                System.out.println(i + " adalah angka sempurna.");
                displayFactors(i);
            }
        }

        // Menguji angka yang lebih besar dari 1000
        int largeNumber = 8128;
        if (isPerfect(largeNumber)) 
        {
            System.out.println(largeNumber + " adalah angka sempurna.");
            displayFactors(largeNumber);
        }
    }
} //akhir kelas
