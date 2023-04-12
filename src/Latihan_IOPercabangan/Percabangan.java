package Latihan_IOPercabangan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Percabangan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // if-else
        // Cek syarat pembuatan KTP
        // Nilai default tipe data string = "" , sedangkan int =0

        int usia = 0;
        System.out.print("Masukan usia anda : ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17) {
            System.out.println("Usia anda sudah memenuhi syarat pembuatan KTP");
        } else {
            System.out.println("Usia anda belum memenuhi syarat pembuatan KTP");
        }

        // if-else if
        // Cek Status kelulusan MK berdasarkan NIM dan Nilai UAS

        String nim;
        int nilaiUAS;
        System.out.print("Masukan NIM anda :");
        nim = br.readLine();
        System.out.print("Masukan nilai UAS anda :");
        nilaiUAS = Integer.parseInt(br.readLine());

        // Jika nilai 80, 70, 65 = lulus, dibawah 65 tidak lulus

        // Untuk mengecek tipe data string
        // equals : memperhatikan detail besar kecil huruf (case sensitive)
        // equalsIgnoreCase : tidak memperhatikan detail besar kecil huruf (non-case sensitive)
        // && = untuk mengecek keduanya (nim dan nilai )
        // || = hanya mengecek salah satu

        if (nim.equalsIgnoreCase("22410100049")
                && nilaiUAS == 80) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100049")
                && nilaiUAS == 70) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100049")
                && nilaiUAS == 65) {
            System.out.println("LULUS");
        } else if (nim.equalsIgnoreCase("22410100049")
                && nilaiUAS < 65) {
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("Nilai Tidak Ditemukan");
        }


        // nested if
        // Cek menu yang dipilih (makanan/minuman)
        // Makanan = snack, nasi bungkus
        // Minuman = kopi, teh, air mineral

        String menu, jenis;
        System.out.print("Masukan Menu(makanan/minuman) : ");
        menu = br.readLine();
        System.out.print("Masukan Jenis Menu \n makanan: snack, nasi bungkus \n"
                + "minuman: kopi, teh, air mineral. Pilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("makanan")) {
            if (jenis.equalsIgnoreCase("snack")) {
                System.out.println("Harga Rp 2.000");
            } else
            {
                System.out.println("Harga Rp 10.000");
            }
        } else if (menu.equalsIgnoreCase("minuman")){
            if (jenis.equalsIgnoreCase("kopi")) {
                System.out.println("Harga Rp 3.000");
            }
            else if (jenis.equalsIgnoreCase("teh")) {
                System.out.println("Harga Rp 4.000");
            }
            else if (jenis.equalsIgnoreCase("air mineral")) {
                System.out.println("Harga Rp 5.000");
            }

        }
    }
}