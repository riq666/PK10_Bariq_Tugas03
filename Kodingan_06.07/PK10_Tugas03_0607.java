package pk10_tugas03_06.pkg07;

/**
 * operasi matematika 06.07
 * @author Bariq 07/07-2024
 */

public class PK10_Tugas03_0607 
{
    public static void main(String[] args) 
    {
        double x;

        // a) x = Math.abs(7.5);
        x = Math.abs(7.5);
        System.out.printf("Nilai x setelah pernyataan a) adalah: %f%n", x);

        // b) x = Math.floor(7.5);
        x = Math.floor(7.5);
        System.out.printf("Nilai x setelah pernyataan b) adalah: %f%n", x);

        // c) x = Math.abs(0.0);
        x = Math.abs(0.0);
        System.out.printf("Nilai x setelah pernyataan c) adalah: %f%n", x);

        // d) x = Math.ceil(0.0);
        x = Math.ceil(0.0);
        System.out.printf("Nilai x setelah pernyataan d) adalah: %f%n", x);

        // e) x = Math.abs(-6.4);
        x = Math.abs(-6.4);
        System.out.printf("Nilai x setelah pernyataan e) adalah: %f%n", x);

        // f) x = Math.ceil(-6.4);
        x = Math.ceil(-6.4);
        System.out.printf("Nilai x setelah pernyataan f) adalah: %f%n", x);

        // g) x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.printf("Nilai x setelah pernyataan g) adalah: %f%n", x);
    }
} //akhir kelas