package pk10_tugas03_06.pkg09;

import java.util.Scanner;

/**
 * membulatkan angka 06.09
 * @author Bariq 08/07-2024
 */

public class PK10_Tugas03_0609 
{
    // Metode untuk membulatkan angka ke bilangan bulat terdekat
    public static double roundToNearestInteger(double number) 
    {
        return Math.floor(number + 0.5);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char moreNumbers;

        do 
        {
            // Membaca nilai angka yg ada desimalnya dari pengguna
            System.out.print("Masukkan nilai angka untuk pembulatan: ");
            double originalNumber = input.nextDouble();

            // Membulatkan nilai ke bilangan bulat terdekat
            double roundedNumber = roundToNearestInteger(originalNumber);

            // Menampilkan nilai asli dan nilai yang dibulatkan
            System.out.printf("Nilai asli: %.2f, Nilai yang dibulatkan: %.0f%n", originalNumber, roundedNumber);

            // Menanyakan apakah pengguna ingin memasukkan nilai lain
            System.out.print("Apakah ingin memasukkan nilai lain? (y/n): ");
            moreNumbers = input.next().charAt(0);

        }
        while (moreNumbers == 'y' || moreNumbers == 'Y');
    }
} //akhir kelas