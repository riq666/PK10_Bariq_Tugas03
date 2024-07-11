package pk10_tugas03_06.pkg10;

import java.util.Scanner;

/**
 * membulatkan angka ke bulat terdekat; persepuluhan terdekat; 
 * perseratusan terdekat; dan perseribuan terdekat
 * 
 * @author Bariq 08/07-2024
 */

public class PK10_Tugas03_0610 
{
    // Metode untuk membulatkan angka ke bilangan bulat terdekat
    public static double roundToInteger(double number) 
    {
        return Math.floor(number + 0.5);
    }

    // Metode untuk membulatkan angka ke posisi persepuluhan terdekat
    public static double roundToTenths(double number) 
    {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    // Metode untuk membulatkan angka ke posisi perseratusan terdekat
    public static double roundToHundredths(double number) 
    {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    // Metode untuk membulatkan angka ke posisi perseribuan terdekat
    public static double roundToThousandths(double number) 
    {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char moreNumbers;

        do 
        {
            // Membaca nilai double dari pengguna
            System.out.print("Masukkan nilai angka untuk pembulatan: ");
            double originalNumber = input.nextDouble();

            // Membulatkan nilai ke berbagai posisi
            double roundedToInteger = roundToInteger(originalNumber);
            double roundedToTenths = roundToTenths(originalNumber);
            double roundedToHundredths = roundToHundredths(originalNumber);
            double roundedToThousandths = roundToThousandths(originalNumber);

            // Menampilkan nilai asli dan nilai yang dibulatkan
            System.out.printf("Nilai asli: %.6f%n", originalNumber);
            System.out.printf("Nilai yang dibulatkan ke bilangan bulat terdekat: %.0f%n", roundedToInteger);
            System.out.printf("Nilai yang dibulatkan ke persepuluhan terdekat: %.1f%n", roundedToTenths);
            System.out.printf("Nilai yang dibulatkan ke perseratusan terdekat: %.2f%n", roundedToHundredths);
            System.out.printf("Nilai yang dibulatkan ke perseribuan terdekat: %.3f%n", roundedToThousandths);

            // Menanyakan apakah pengguna ingin memasukkan nilai lain
            System.out.print("Apakah ingin memasukkan nilai lain? (y/n): ");
            moreNumbers = input.next().charAt(0);

        } while (moreNumbers == 'y' || moreNumbers == 'Y');
    }
} //akhir kelas