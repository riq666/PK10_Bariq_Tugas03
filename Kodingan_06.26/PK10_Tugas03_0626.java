package pk10_tugas03_06.pkg26;

import java.util.Scanner;

/**
 * membalikkan angka (max 10 digit)
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0626 
{
    // Metode untuk membalikkan digit sebuah bilangan bulat
    public static int reverse(int number) 
    {
        int reversedNumber = 0;

        while (number != 0) 
        {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int number = input.nextInt();

        int reversedNumber = reverse(number);

        System.out.printf("Angka setelah dibalik: %d%n", reversedNumber);
    }
} //akhir kelas