package pk10_tugas03_06.pkg08;

import java.util.Scanner;

/**
 * menghitung biaya parkir
 * @author Bariq 08/07-2024
 */

// mata uang yang digunakan diganti menjadi rupiah bukan dollar 

public class PK10_Tugas03_0608 
{
    // Metode untuk menghitung biaya parkir
    public static double calculateCharges(int hours) 
    {
        double charge = 2000.0; // Biaya minimum untuk 3 jam pertama

        if (hours > 3) 
        {
            charge += 500.0 * (hours - 3);
        }

        if (charge > 10000.0) 
        {
            charge = 10000.0; // Biaya maksimum untuk 24 jam
        }

        return charge;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double totalReceipts = 0.0;
        char moreCustomers;

        do 
        {
            System.out.print("Masukkan jumlah jam parkir: ");
            int hoursParked = input.nextInt();

            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            System.out.printf("Biaya parkir untuk pelanggan saat ini: Rp %.0f%n", charge);
            System.out.printf("Total penerimaan hari ini: Rp %.0f%n", totalReceipts);

            System.out.print("Apakah ada pelanggan lain? (y/n): ");
            moreCustomers = input.next().charAt(0);

        }
        while (moreCustomers == 'y' || moreCustomers == 'Y');

        System.out.printf("Total penerimaan akhir untuk hari ini: Rp %.0f%n", totalReceipts);
    }
} //akhir kelas