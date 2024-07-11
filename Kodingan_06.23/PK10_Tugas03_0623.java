package pk10_tugas03_06.pkg23;

import java.util.Scanner;

/**
 * menentukan angka terkecil
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0623 {

    // Metode untuk menemukan nilai minimum dari tiga angka floating-point
    public static double minimum3(double num1, double num2, double num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca tiga nilai dari pengguna
        System.out.print("Masukkan nilai pertama: ");
        double num1 = input.nextDouble();

        System.out.print("Masukkan nilai kedua: ");
        double num2 = input.nextDouble();

        System.out.print("Masukkan nilai ketiga: ");
        double num3 = input.nextDouble();

        // Menentukan nilai terkecil
        double min = minimum3(num1, num2, num3);

        // Menampilkan hasil
        System.out.printf("Nilai terkecil dari %.2f, %.2f, dan %.2f adalah %.2f%n", num1, num2, num3, min);

        input.close();
    }
} //akhir kelas