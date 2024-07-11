package pk10_tugas03_06.pkg37;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 * Computer-Assisted Instruction (CAI) versi 3 dengan monitoring performa siswa
 * (harus berhenti manual)
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0637 
{
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) 
        {
            jalankanProgram();
        }
    }

    public static void jalankanProgram() 
    {
        int jawabanBenar = 0;
        int jawabanSalah = 0;

        for (int i = 0; i < 10; i++) 
        {
            if (generateQuestion()) 
            {
                jawabanBenar++;
            }
            else 
            {
                jawabanSalah++;
            }
        }

        int persentaseBenar = (jawabanBenar * 100) / 10;

        if (persentaseBenar >= 75) 
        {
            System.out.println("Selamat, kamu siap untuk melanjutkan ke tingkat berikutnya!");
        }
        else
        {
            System.out.println("Silakan minta bantuan tambahan dari gurumu.");
        }
    }

    public static boolean generateQuestion() 
    {
        int number1 = 1 + randomNumbers.nextInt(9);
        int number2 = 1 + randomNumbers.nextInt(9);
        int correctAnswer = number1 * number2;

        System.out.printf("Berapa hasil dari %d kali %d? ", number1, number2);
        int userAnswer = input.nextInt();

        if (userAnswer == correctAnswer) 
        {
            displayCorrectResponse();
            return true;
        }
        else
        {
            displayIncorrectResponse();
            return false;
        }
    }

    public static void displayCorrectResponse() 
    {
        int response = 1 + randomNumbers.nextInt(4);
        switch (response) 
        {
            case 1:
                System.out.println("Sangat bagus!");
                break;
            case 2:
                System.out.println("Hebat!");
                break;
            case 3:
                System.out.println("Kerja bagus!");
                break;
            case 4:
                System.out.println("Teruskan kerja bagusmu!");
                break;
        }
    }

    public static void displayIncorrectResponse() 
    {
        int response = 1 + randomNumbers.nextInt(4);
        switch (response) 
        {
            case 1:
                System.out.println("Tidak. Silakan coba lagi.");
                break;
            case 2:
                System.out.println("Salah. Coba sekali lagi.");
                break;
            case 3:
                System.out.println("Jangan menyerah!");
                break;
            case 4:
                System.out.println("Tidak. Teruslah mencoba.");
                break;
        }
    }
} // akhir kelas