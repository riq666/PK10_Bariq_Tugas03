package pk10_tugas03_06.pkg34;

/**
 * menampilkan bilangan desimal, biner, oktal, dan heksadesimal dari 1-256
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0634  
{
    public static void main(String[] args) 
    {
        System.out.printf("%-10s%-15s%-15s%-15s%n", "Desimal", "Biner", "Oktal", "Heksadesimal");

        for (int i = 1; i <= 256; i++) 
        {
            String biner = Integer.toBinaryString(i);
            String oktal = Integer.toOctalString(i);
            String heksadesimal = Integer.toHexString(i).toUpperCase();

            System.out.printf("%-10d%-15s%-15s%-15s%n", i, biner, oktal, heksadesimal);
        }
    }
} //akhir kelas