package pk10_tugas03_06.pkg12;

import java.util.Random;

/**
 * Program untuk menghasilkan angka acak dalam berbagai rentang
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0612 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int n;

        // a) 1 ≤ n ≤ 2
        n = 1 + random.nextInt(2);
        System.out.printf("a) %d%n", n);

        // b) 1 ≤ n ≤ 100
        n = 1 + random.nextInt(100);
        System.out.printf("b) %d%n", n);

        // c) 0 ≤ n ≤ 9
        n = random.nextInt(10);
        System.out.printf("c) %d%n", n);

        // d) 1000 ≤ n ≤ 1112
        n = 1000 + random.nextInt(113);
        System.out.printf("d) %d%n", n);

        // e) -1 ≤ n ≤ 1
        n = -1 + random.nextInt(3);
        System.out.printf("e) %d%n", n);

        // f) -3 ≤ n ≤ 11
        n = -3 + random.nextInt(15);
        System.out.printf("f) %d%n", n);
    }
} //akhir kelas