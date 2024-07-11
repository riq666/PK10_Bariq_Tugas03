package pk10_tugas03_06.pkg16;

import java.util.Scanner;

/**
 * menentukan angka kelipatan atau bukan
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0616 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Loop untuk terus meminta input dari pengguna
        while (true) {
            System.out.print("Masukkan dua bilangan integer (pisahkan dengan spasi, atau ketik 'exit' untuk keluar): ");
            String userInput = input.nextLine();

            // Periksa apakah pengguna ingin keluar dari program
            if (userInput.equalsIgnoreCase("exit")) 
            {
                break;
            }

            // Split input menjadi dua bilangan
            String[] tokens = userInput.split(" ");
            if (tokens.length != 2) 
            {
                System.out.println("Input tidak valid. Harap masukkan dua bilangan bulat.");
                continue;
            }

            try 
            {
                int firstNumber = Integer.parseInt(tokens[0]);
                int secondNumber = Integer.parseInt(tokens[1]);

                // Periksa apakah secondNumber adalah kelipatan dari firstNumber
                boolean result = isMultiple(firstNumber, secondNumber);
                if (result) 
                {
                    System.out.printf("%d adalah kelipatan dari %d%n", secondNumber, firstNumber);
                }
                else 
                {
                    System.out.printf("%d bukan kelipatan dari %d%n", secondNumber, firstNumber);
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Input tidak valid. Harap masukkan dua bilangan bulat.");
            }
        }
    }

    // Metode untuk menentukan apakah secondNumber adalah kelipatan dari firstNumber
    public static boolean isMultiple(int firstNumber, int secondNumber) {
        return secondNumber % firstNumber == 0;
    }
} //akhir kelas