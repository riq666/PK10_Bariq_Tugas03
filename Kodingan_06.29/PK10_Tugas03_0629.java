package pk10_tugas03_06.pkg29;

import java.util.Scanner;
import java.util.Random;

/**
 * melempar koin
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0629 
{
    // Enum untuk merepresentasikan sisi koin
    public enum Coin 
    {
        HEADS, TAILS
    }

    // Metode untuk mensimulasikan lemparan koin
    public static Coin flip() 
    {
        Random random = new Random();
        int result = random.nextInt(2); // 0 atau 1
        return (result == 0) ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) 
        {
            System.out.println("Pilih menu:");
            System.out.println("1. Lempar Koin");
            System.out.println("2. Lihat Hasil");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = input.nextInt();

            if (choice == 1) 
            {
                Coin result = flip();
                if (result == Coin.HEADS) 
                {
                    headsCount++;
                    System.out.println("Hasil lemparan: KEPALA");
                }
                else
                {
                    tailsCount++;
                    System.out.println("Hasil lemparan: EKOR");
                }
            } 
            else if (choice == 2) 
            {
                System.out.printf("KEPALA muncul: %d kali%n", headsCount);
                System.out.printf("EKOR muncul: %d kali%n", tailsCount);
            }
            else if (choice == 3) 
            {
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            }
            else 
            {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
} //akhir kelas