package pk10_tugas03_06.pkg35;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 * Computer-Assisted Instruction (CAI) versi 1 (harus berhenti manual)
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0635 
{
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) 
        {
            generateQuestion();
        }
    }

    public static void generateQuestion() 
    {
        int number1 = 1 + randomNumbers.nextInt(9);
        int number2 = 1 + randomNumbers.nextInt(9);
        int correctAnswer = number1 * number2;
        
        while (true) 
        {
            System.out.printf("Berapa hasil dari %d kali %d? ", number1, number2);
            int userAnswer = input.nextInt();
            
            if (userAnswer == correctAnswer) 
            {
                System.out.println("Sangat bagus!");
                break;
            }
            else 
            {
                System.out.println("Tidak. Silakan coba lagi.");
            }
        }
    }
} //akhir kelas