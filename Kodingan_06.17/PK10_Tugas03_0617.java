package pk10_tugas03_06.pkg17;

import java.util.Scanner;

/**
 * menentukan angka bulat genap atau ganjil
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0617 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Loop untuk terus meminta input dari pengguna
        while (true) 
        {
            System.out.print("Masukkan sebuah bilangan bulat (atau ketik 'exit' untuk keluar): ");
            String userInput = input.nextLine();

            // Periksa apakah pengguna ingin keluar dari program
            if (userInput.equalsIgnoreCase("exit")) 
            {
                break;
            }

            try 
            {
                int number = Integer.parseInt(userInput);

                // Periksa apakah bilangan adalah genap atau ganjil
                if (isEven(number)) 
                {
                    System.out.printf("%d adalah bilangan genap%n", number);
                }
                else 
                {
                    System.out.printf("%d adalah bilangan ganjil%n", number);
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Input tidak valid. Harap masukkan sebuah bilangan bulat.");
            }
        }
    }

    // Metode untuk menentukan apakah bilangan adalah genap
    public static boolean isEven(int number) 
    {
        return number % 2 == 0;
    }
} //akhir kelas