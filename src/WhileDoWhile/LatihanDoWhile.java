package WhileDoWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LatihanDoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // try catch (error handling) berfungsi untuk menangani error yang terjadi dan dapat memberikan custom error text

        //Letakan variabel sebelum block try agar dapat terbaca
        /*int nim;
        int i =0;
        String nama;
        try {
            do {
                System.out.print("Entry NIM     : ");
                nim = Integer.parseInt(br.readLine());
                System.out.print("Entry Nama    : ");
                nama = br.readLine();
                i++;
            } while (i < 5);

        } catch (Exception e) {

        }*/
        // deklarasi variabel diluar blok try

        String nimMhs = null, namaMhs = null, prodi = null, mk = null, cari =null ;
        int uts, uas, tugas, menu, nilaiAKhir = 0;

        try {
            /*Membuat program dengan menu
                1. Entry mahasiswa (nim, nama, prodi, mk)
                2. Hitung nilai mahasiswa (uts, uas, tugas)
                3. Lihat raport mahasiswa
                4. Keluar program
            */
            do {
                System.out.println("        -----Program Akademik Mahasiswa----- ");
                System.out.println("1. Entry Mahasiswa              ");
                System.out.println("2. Hitung Nilai MK Mahasiswa    ");
                System.out.println("3. Lihat Raport Mahasiswa       ");
                System.out.print("4. Keluar Program ( Ketikan 1-4  ) : ");
                menu = Integer.parseInt(br.readLine());


                // mengisi logika setiap menu (dengan menggunakan percabangan if, switch-case)
                // switch-case = percabangan

                switch (menu) {
                    /*
                    case sama hal nya dengan if else if seperti dibawah ini
                    if menu (==1){
                    }else if (menu==2){
                    }else { (else dalam if-else-if = default)
                    }
                     */
                    case 1:
                        System.out.println("            -----Menu Entry Mahasiswa----- ");
                        System.out.print("Entry NIM           : ");
                        nimMhs = br.readLine();
                        System.out.print("Entry Nama          : ");
                        namaMhs = br.readLine();
                        System.out.print("Entry Program Studi : ");
                        prodi = br.readLine();
                        System.out.print("Entry Mata Kuliah   : ");
                        mk = br.readLine();
                        System.out.println();

                        break;
                    // break artinya berhenti proses case 1, dan mengembalikan ke perualangan awal (menu di awal)
                    case 2:
                        // hitung nilai akhir (30% * uts + 30% * uas + 40% * tugas)
                        System.out.println("            -----Menu Hitung Nilai-----");

                        System.out.print("Cari Berdasarkan NIM : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                         //jika sesuai, entry nilai. jika tidak, ada pesan "data tidak ditemukan"
                            System.out.print("Entry Nilai UTS     : ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.print("Entry Nilai UAS     : ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.print("Entry Nilai TUGAS   : ");
                            tugas = Integer.parseInt(br.readLine());

                            // rumus nilai akhir (di java tidak bisa langsung menggunakan %)
                            nilaiAKhir = (uts * 30 / 100) + (uas * 30 / 100) + (tugas * 40 / 100);

                            // Cetak Nilai Akhir
                            System.out.println("Nilai Akhir : " + nilaiAKhir);
                        }
                        else {
                            System.out.println("            Data Tidak Ditemukan");
                        }
                        break;
                    case 3:
                        // Menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.println("            -----Menu Raport Mahasiswa-----");
                        System.out.println("Cari Berdasarkan NIM :");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)) {
                            System.out.println(nimMhs);
                            System.out.println(namaMhs);
                            System.out.println("Nilai Akhir MK " + mk + " : " + nilaiAKhir);
                        /*
                        Tabel Nilai
                        A  = 80-100
                        B+ = 75-79
                        B  = 65-74
                        C+ = 60-64
                        C  = 55-59
                        Nilai <55 == D/E
                         */
                            if (nilaiAKhir >= 80 && nilaiAKhir <= 100) {
                                System.out.println("Nilai Huruf : A");
                            } else if (nilaiAKhir >= 75 && nilaiAKhir <= 79) {
                                System.out.println("Nilai Huruf : B+");
                            } else if (nilaiAKhir >= 65 && nilaiAKhir <= 74) {
                                System.out.println("Nilai Huruf : B");
                            } else if (nilaiAKhir >= 60 && nilaiAKhir <= 64) {
                                System.out.println("Nilai Huruf : C+");
                            } else if (nilaiAKhir >= 55 && nilaiAKhir <= 59) {
                                System.out.println("Nilai Huruf : C");
                            } else  {
                                System.out.println("Nilai Huruf : D/E");
                            }
                        }else {
                            System.out.println("Data Tidak Ditemukan");
                        }

                        break;
                    default: // jika yang dipilih diluar 1-3, maka menjalankan apa
                        System.out.println("            -----Terimakasi-----");
                        System.exit(0);
                }
            }

            while (menu < 4); // boleh diisi dengan true
        } catch (Exception e) {
            System.out.println("Tedapat Kesalahan -->" + e.getMessage());

        }
    }
}