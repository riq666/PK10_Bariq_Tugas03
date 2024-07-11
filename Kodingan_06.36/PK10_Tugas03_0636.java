package pk10_tugas03_06.pkg36;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 * Computer-Assisted Instruction (CAI) versi 2 ditambahkan kata2 motivasi
 * (harus berhenti manual)
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0636 
{
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

public static void main(String[] args) {
        while (true) {
            generateQuestion();
        }
    }

    public static void generateQuestion() {
        int number1 = 1 + randomNumbers.nextInt(9);
        int number2 = 1 + randomNumbers.nextInt(9);
        int correctAnswer = number1 * number2;

        while (true) {
            System.out.printf("Berapa hasil dari %d kali %d? ", number1, number2);
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {
                displayCorrectResponse();
                break;
            } else {
                displayIncorrectResponse();
            }
        }
    }

    public static void displayCorrectResponse() {
        int response = 1 + randomNumbers.nextInt(4);
        switch (response) {
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

    public static void displayIncorrectResponse() {
        int response = 1 + randomNumbers.nextInt(4);
        switch (response) {
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
} //akhir kelas