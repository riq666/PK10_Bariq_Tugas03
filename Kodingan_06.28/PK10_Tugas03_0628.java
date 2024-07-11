package pk10_tugas03_06.pkg28;

import java.util.Scanner;

/**
 * menentukan kualitas poin berdasarkan nilai2 siswa
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0628 
{
    // Metode untuk menghitung kualitas poin berdasarkan rata-rata nilai
    public static int qualityPoints(int average) 
    {
        if (average >= 90 && average <= 100) 
        {
            return 4;
        }
        else if (average >= 80 && average <= 89) 
        {
            return 3;
        }
        else if (average >= 70 && average <= 79) 
        {
            return 2;
        }
        else if (average >= 60 && average <= 69) 
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan rata-rata nilai siswa: ");
        int average = input.nextInt();

        int result = qualityPoints(average);

        System.out.printf("Kualitas poin untuk rata-rata nilai %d adalah: %d%n", average, result);
    }
} //akhir kelas