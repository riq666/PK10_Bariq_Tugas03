package pk10_tugas03_06.pkg32;

import java.util.Scanner;

/**
 * menghitung jarak antara dua titik
 * @author Bariq 11/07-2024
 */ 

public class PK10_Tugas03_0632 
{
   
    // Metode untuk menghitung jarak antara dua titik
    public static double distance(double x1, double y1, double x2, double y2) 
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan koordinat titik pertama
        System.out.print("Masukkan koordinat x1: ");
        double x1 = input.nextDouble();
        System.out.print("Masukkan koordinat y1: ");
        double y1 = input.nextDouble();
        
        // Meminta pengguna untuk memasukkan koordinat titik kedua
        System.out.print("Masukkan koordinat x2: ");
        double x2 = input.nextDouble();
        System.out.print("Masukkan koordinat y2: ");
        double y2 = input.nextDouble();
        
        // Menghitung jarak antara dua titik
        double jarak = distance(x1, y1, x2, y2);
        
        // Menampilkan hasil jarak
        System.out.printf("Jarak antara titik (%.2f, %.2f) dan (%.2f, %.2f) adalah %.2f%n", x1, y1, x2, y2, jarak);
    }
} //akhir kelas