package pk10_tugas03_06.pkg33;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 * modifikasi permainan dadu craps dari gambar 6.8
 * @author Bariq 11/07-2024
 */

public class PK10_Tugas03_0633 
{
    // buat generator angka acak yang aman untuk digunakan dalam metode rollDice
    private static final SecureRandom angkaAcak = new SecureRandom();

    // tipe enum dengan konstanta yang mewakili status permainan
    private enum Status { LANJUTKAN, MENANG, KALAH };

    // konstanta yang mewakili gulungan dadu umum
    private static final int MATA_ULAR = 2;
    private static final int TREY = 3;
    private static final int TUJUH = 7;
    private static final int SEBELAS = 11;
    private static final int BOX_CARS = 12;

    private static int saldoBank = 1000000; // saldo awal bank

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (saldoBank > 0) {
            System.out.printf("Saldo Bank: Rp%d%n", saldoBank);
            System.out.print("Masukkan taruhan Anda: ");
            int taruhan = input.nextInt();

            // pastikan taruhan valid
            while (taruhan > saldoBank || taruhan <= 0) {
                System.out.print("Taruhan tidak valid. Masukkan taruhan yang valid: ");
                taruhan = input.nextInt();
            }

            Status statusPermainan = mainkanPermainan(); // mainkan satu permainan craps

            // sesuaikan saldoBank berdasarkan hasil permainan
            if (statusPermainan == Status.MENANG) {
                saldoBank += taruhan;
                System.out.printf("Anda menang! Saldo baru Anda adalah: Rp%d%n", saldoBank);
            } else {
                saldoBank -= taruhan;
                System.out.printf("Anda kalah. Saldo baru Anda adalah: Rp%d%n", saldoBank);
                if (saldoBank == 0) {
                    System.out.println("Maaf. Anda bangkrut!");
                }
            }

            // tampilkan pesan acak
            tampilkanPesanAcak();
        }

        System.out.println("Permainan selesai! Terima kasih sudah bermain.");
    }

    // metode untuk memainkan satu permainan craps
    public static Status mainkanPermainan()
    {
        int poinSaya = 0; // poin jika tidak menang atau kalah pada gulungan pertama
        Status statusPermainan; // bisa berisi LANJUTKAN, MENANG atau KALAH
        int jumlahDadu = gulungDadu(); // gulungan pertama dadu

        // tentukan status permainan dan poin berdasarkan gulungan pertama
        switch (jumlahDadu)
        {
            case TUJUH: // menang dengan 7 pada gulungan pertama
            case SEBELAS: // menang dengan 11 pada gulungan pertama
                statusPermainan = Status.MENANG;
                break;
            case MATA_ULAR: // kalah dengan 2 pada gulungan pertama
            case TREY: // kalah dengan 3 pada gulungan pertama
            case BOX_CARS: // kalah dengan 12 pada gulungan pertama
                statusPermainan = Status.KALAH;
                break;
            default: // tidak menang atau kalah, jadi ingat poin
                statusPermainan = Status.LANJUTKAN; // permainan belum selesai
                poinSaya = jumlahDadu; // ingat poinnya
                System.out.printf("Poin adalah %d%n", poinSaya);
                break;
        }

        // saat permainan belum selesai
        while (statusPermainan == Status.LANJUTKAN) // belum MENANG atau KALAH
        {
            jumlahDadu = gulungDadu(); // gulung dadu lagi

            // tentukan status permainan
            if (jumlahDadu == poinSaya) // menang dengan membuat poin
                statusPermainan = Status.MENANG;
            else if (jumlahDadu == TUJUH) // kalah dengan menggulung 7 sebelum poin
                statusPermainan = Status.KALAH;
        }

        // tampilkan pesan menang atau kalah
        if (statusPermainan == Status.MENANG)
            System.out.println("Pemain menang");
        else
            System.out.println("Pemain kalah");

        return statusPermainan;
    }

    // gulung dadu, hitung jumlah dan tampilkan hasil
    public static int gulungDadu()
    {
        // pilih nilai dadu acak
        int dadu1 = 1 + angkaAcak.nextInt(6); // gulungan pertama dadu
        int dadu2 = 1 + angkaAcak.nextInt(6); // gulungan kedua dadu

        int jumlah = dadu1 + dadu2; // jumlah nilai dadu

        // tampilkan hasil gulungan ini
        System.out.printf("Pemain menggulung %d + %d = %d%n", 
            dadu1, dadu2, jumlah);

        return jumlah;
    }

    // metode untuk menampilkan pesan acak
    public static void tampilkanPesanAcak()
    {
        String[] pesan = {
            "Oh, Anda akan habis-habisan, ya?",
            "Ayo cobalah, ambil risiko!",
            "Anda menang besar. Sekarang waktunya untuk mencairkan chip Anda!"
        };
        int indeks = angkaAcak.nextInt(pesan.length);
        System.out.println(pesan[indeks]);
    }
} // akhir kelas