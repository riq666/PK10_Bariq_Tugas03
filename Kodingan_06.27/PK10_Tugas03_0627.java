package pk10_tugas03_06.pkg27;

import java.util.Scanner;

/**
 * mencari pembagi terbesar
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0627 
{
    // Metode untuk menghitung GCD menggunakan algoritma Euclidean
    public static int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int num1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int num2 = input.nextInt();

        int result = gcd(num1, num2);

        System.out.printf("Pembagi terbesar dari %d dan %d adalah: %d%n", num1, num2, result);
    }
} //akhir kelas