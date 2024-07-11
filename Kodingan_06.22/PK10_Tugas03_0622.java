package pk10_tugas03_06.pkg22;

import java.util.Scanner;

/**
 * konversi suhu fahrenheit ke celsius dan sebaliknya
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0622 
{
    // Metode untuk mengonversi suhu dari Fahrenheit ke Celsius
    public static double celsius(double fahrenheit) 
    {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Metode untuk mengonversi suhu dari Celsius ke Fahrenheit
    public static double fahrenheit(double celsius) 
    {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // Menu untuk memilih jenis konversi
        System.out.println("Pilih jenis konversi suhu:");
        System.out.println("1. Fahrenheit ke Celsius");
        System.out.println("2. Celsius ke Fahrenheit");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int choice = input.nextInt();

        switch (choice) 
        {
            case 1:
                // Konversi dari Fahrenheit ke Celsius
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                double fahrenheitTemp = input.nextDouble();
                double celsiusTemp = celsius(fahrenheitTemp);
                System.out.printf("%.2f Fahrenheit sama dengan %.2f Celsius%n", fahrenheitTemp, celsiusTemp);
                break;
            case 2:
                // Konversi dari Celsius ke Fahrenheit
                System.out.print("Masukkan suhu dalam Celsius: ");
                double celsiusValue = input.nextDouble();
                double fahrenheitValue = fahrenheit(celsiusValue);
                System.out.printf("%.2f Celsius sama dengan %.2f Fahrenheit%n", celsiusValue, fahrenheitValue);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
        }
        
        input.close();
    }
} //akhir kelas