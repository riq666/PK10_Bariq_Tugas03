package pk10_tugas03_06.pkg31;

import java.util.Scanner;
import java.util.Random;

/**
 * modifikasi game tebak angka
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0631 
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
        int guessCount = 0;

        System.out.println("Tebak sebuah bilangan dari 1 and 1000.");

        while (!correct) 
        {
            System.out.print("Masukkan tebakanmu: ");
            guess = input.nextInt();
            guessCount++;

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

        if (guessCount <= 10) 
        {
            System.out.println("Entah kamu tahu rahasianya atau kamu beruntung!");
        } 
        else if (guessCount == 10) 
        {
            System.out.println("Aha! Kamu tahu rahasianya!");
        } 
        else 
        {
            System.out.println("Kamu seharusnya bisa melakukannya dengan lebih baik! "
                    + "Mengapa harus lebih dari 10 tebakan? Dengan setiap tebakan yang baik, "
                    + "kamu seharusnya bisa mengeliminasi setengah dari angka yang tersisa.");
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
} // akhir kelas