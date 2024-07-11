package pk10_tugas03_06.pkg21;

import java.util.Scanner;

/**
 * pemisah angka max hanya 5 digit
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0621 {
    
    // Metode untuk menghitung bagian integer dari hasil bagi
    public static int integerQuotient(int a, int b) {
        return a / b;
    }

    // Metode untuk menghitung sisa hasil bagi
    public static int integerRemainder(int a, int b) {
        return a % b;
    }

    // Metode untuk menampilkan digit dengan pemisah dua spasi
    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Angka harus antara 1 dan 99999.");
            return;
        }

        int divisor = 10000; // divisor untuk angka terbesar 99999

        boolean leadingZero = true;
        while (divisor >= 1) {
            int digit = integerQuotient(number, divisor);
            number = integerRemainder(number, divisor);
            divisor = integerQuotient(divisor, 10);

            if (digit != 0 || !leadingZero || divisor < 1) {
                leadingZero = false;
                System.out.print(digit + "  ");
            }
        }
        System.out.println(); // Baris baru setelah semua digit ditampilkan
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka (1-99999): ");
        int number = input.nextInt();

        // Memanggil metode displayDigits
        displayDigits(number);
    }
} //akhir kelas