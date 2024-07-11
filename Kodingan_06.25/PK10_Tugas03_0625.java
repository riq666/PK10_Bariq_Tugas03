package pk10_tugas03_06.pkg25;

/**
 * menentukan angka prima dgn 2 metode
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0625 
{
    // Metode untuk menentukan apakah sebuah angka adalah angka prima
    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false; // 1 dan angka negatif bukan angka prima
        }

        for (int i = 2; i <= number / 2; i++) 
        {
            if (number % i == 0) 
            {
                return false; // Jika ada pembagi selain 1 dan dirinya sendiri, bukan prima
            }
        }

        return true;
    }

    // Metode untuk menentukan apakah sebuah angka adalah angka prima (hingga akar kuadrat n)
    public static boolean isPrimeOptimized(int number) 
    {
        if (number <= 1) 
        {
            return false; // 1 dan angka negatif bukan angka prima
        }

        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                return false; // Jika ada pembagi selain 1 dan dirinya sendiri, bukan prima
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        System.out.println("Angka prima kurang dari 10.000 (metode n/2):");
        int count = 0;
        for (int i = 2; i < 10000; i++) 
        {
            if (isPrime(i)) 
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total angka prima ditemukan (metode n/2): " + count);

        System.out.println("\nAngka prima kurang dari 10.000 (metode akar kuadrat n):");
        count = 0;
        for (int i = 2; i < 10000; i++) 
        {
            if (isPrimeOptimized(i)) 
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total angka prima ditemukan (metode akar kuadrat n): " + count);
    }
} //akhir kelas