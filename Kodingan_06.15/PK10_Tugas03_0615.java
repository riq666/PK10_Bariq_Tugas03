package pk10_tugas03_06.pkg15;

import java.util.Scanner;

/**
 * menghitung sisi miring segitiga
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0615 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Tabel nilai untuk segitiga
        double[][] sides = 
        {
            {3.0, 4.0},
            {5.0, 12.0},
            {8.0, 15.0}
        };

        // Menghitung dan menampilkan hipotenusa untuk setiap segitiga
        for (int i = 0; i < sides.length; i++) 
        {
            double side1 = sides[i][0];
            double side2 = sides[i][1];
            double hypotenuse = hypotenuse(side1, side2);
            System.out.printf("Segitiga %d: Side 1 = %.1f, Side 2 = %.1f, Hipotenusa = %.1f%n", 
                i + 1, side1, side2, hypotenuse);
        }
    }

    // Metode untuk menghitung hipotenusa
    public static double hypotenuse(double side1, double side2) 
    {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
} //akhir kelas