package pk10_tugas03_06.pkg30;

import java.util.Scanner;
import java.util.Random;

/**
 * game tebak angka
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0630 
{
    // Metode untuk menghasilkan angka acak antara 1 dan 1000
    public static int generateRandomNumber() 
    {
        Random random = new Random();
        return 1 + random.nextInt(1000); // Menghasilkan angka antara 1 dan 1000
    }

    // Metode untuk menjalankan permainan
    public static void playGame() 
    {
        Scanner input = new Scanner(System.in);
        int targetNumber = generateRandomNumber();
        int guess;
        boolean correct = false;

        System.out.println("Tebak sebuah bilangan dari 1 and 1000.");

        while (!correct) 
        {
            System.out.print("Masukkan tebakanmu: ");
            guess = input.nextInt();

            if (guess > targetNumber) 
            {
                System.out.println("Terlalu tinggi. Coba lagi.");
            }
            else if (guess < targetNumber) 
            {
                System.out.println("Terlalu rendah. Coba lagi.");
            }
            else 
            {
                System.out.println("Selamat. Kamu berhasil menebaknya!");
                correct = true;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) 
        {
            playGame();
            System.out.print("Apakah kamu ingin bermain lagi? (iya or tidak): ");
            String response = input.next();
            playAgain = response.equalsIgnoreCase("iya");
        }

        System.out.println("Terima kasih karena sudah bermain!");
    }
} //akhir kelas