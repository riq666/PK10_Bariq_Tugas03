package pk10_tugas03_06.pkg18;

import java.util.Scanner;

/**
 * membuat persegi dgn karakter *
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0618 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna untuk panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        int side = input.nextInt();

        // Menampilkan persegi dengan tanda asterisk
        squareOfAsterisks(side);
    }

    // Metode untuk menampilkan persegi solid dari tanda asterisk
    public static void squareOfAsterisks(int side) 
    {
        for (int i = 0; i < side; i++) 
        {
            for (int j = 0; j < side; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} //akhir kelas