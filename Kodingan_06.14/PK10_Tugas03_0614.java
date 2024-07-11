package pk10_tugas03_06.pkg14;

import java.util.Scanner;

/**
 * menghitung hasil angka pangkat
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0614 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan basis (bilangan bulat): ");
        int base = input.nextInt();
        System.out.print("Masukkan eksponen (bilangan bulat positif): ");
        int exponent = input.nextInt();

        // Memeriksa apakah eksponen adalah angka positif
        if (exponent <= 0) 
        {
            System.out.println("Eksponen harus berupa bilangan bulat positif.");
        }
        else
        {
            // Menghitung dan menampilkan hasil pangkat
            int result = integerPower(base, exponent);
            System.out.printf("%d pangkat %d adalah %d%n", base, exponent, result);
        }

        input.close();
    }

    // Metode untuk menghitung nilai pangkat
    public static int integerPower(int base, int exponent) 
    {
        int result = 1;
        for (int i = 1; i <= exponent; i++) 
        {
            result *= base;
        }
        return result;
    }
} //akhir kelas