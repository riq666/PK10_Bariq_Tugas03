package pk10_tugas03_06.pkg19;

import java.util.Scanner;

/**
 * membuat persegi dgn karakter bebas
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0619 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna untuk panjang sisi persegi
        System.out.print("Masukkan panjang sisi persegi: ");
        int side = input.nextInt();

        // Meminta input dari pengguna untuk karakter pengisi persegi
        System.out.print("Masukkan karakter pengisi: ");
        char fill = input.next().charAt(0);

        // Menampilkan persegi dengan karakter pengisi
        squareOfAnyCharacter(side, fill);
    }

    // Metode untuk menampilkan persegi dengan karakter pengisi
    public static void squareOfAnyCharacter(int side, char fillCharacter) 
    {
        for (int i = 0; i < side; i++) 
        {
            for (int j = 0; j < side; j++) 
            {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
} //akhir kelas
