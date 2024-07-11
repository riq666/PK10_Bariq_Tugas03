package pk10_tugas03_06.pkg13;

import java.util.Random;

/**
 * Program untuk menghasilkan angka acak yg tlh ditentukan
 * @author Bariq 09/07-2024
 */

public class PK10_Tugas03_0613 
{
    public static void main(String[] args) 
    {
        Random random = new Random();

        // a) 2, 4, 6, 8, 10
        int[] setA = {2, 4, 6, 8, 10};
        int randomIndexA = random.nextInt(setA.length);
        System.out.printf("a) %d%n", setA[randomIndexA]);

        // b) 3, 5, 7, 9, 11
        int[] setB = {3, 5, 7, 9, 11};
        int randomIndexB = random.nextInt(setB.length);
        System.out.printf("b) %d%n", setB[randomIndexB]);

        // c) 6, 10, 14, 18, 22
        int[] setC = {6, 10, 14, 18, 22};
        int randomIndexC = random.nextInt(setC.length);
        System.out.printf("c) %d%n", setC[randomIndexC]);
    }
} //akhir kelas