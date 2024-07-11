package pk10_tugas03_06.pkg20;

import java.util.Scanner;

/**
 * menghitung luas lingkaran
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0620 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna untuk jari-jari lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double radius = input.nextDouble();

        // Menghitung luas lingkaran
        double area = circleArea(radius);

        // Menampilkan hasil
        System.out.printf("Luas lingkaran dengan jari-jari %.2f adalah %.2f%n", radius, area);
    }

    // Metode untuk menghitung luas lingkaran
    public static double circleArea(double radius) 
    {
        return Math.PI * Math.pow(radius, 2);
    }
} //akhir kelas