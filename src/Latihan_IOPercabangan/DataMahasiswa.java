package Latihan_IOPercabangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataMahasiswa {



    /* Step 1 import library
         import java.io.InputStreamReader;
         import java.io.IOException;
         import java.io.BufferedReader;
    */
        public static void main(String[] args) {
            // Step 3 deklarasi class BufferedReader ( tipe data class bufferedreader (br) (nonprimitiv)

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Secara default BuffeRedearer hanya menghandle Tipe Data String namun dapat di parseInt agar dapat menghandle tipe data lainnya

            // Step 4 deklrasi variabel

            String nim, nama, prodi;
            int semester, sksAmbil;

            // Step 2 error handling
            // try catch
            try {

                // Step 5 pengerjaan logika program ( didalam try)
                System.out.println("-----Data Mahasiswa-----"); //header

                //input
                // System.out.print (pengisiian disamping)
                // System.out.printl (pengisiian dibawah)

                System.out.print("NIM : ");
                nim = br.readLine();
                System.out.print("NAMA : ");
                nama = br.readLine();
                System.out.print("PRODI : ");
                prodi = br.readLine();
                System.out.print("SEMESTER : ");
                semester = Integer.parseInt(br.readLine());
                System.out.print("Jumlah SKS yang diambil : ");
                sksAmbil = Integer.parseInt(br.readLine());

                //output
                System.out.println("NIM Mahasiswa        : " + nim);
                System.out.println("NAMA Mahasiswa       : " + nama);
                System.out.println("PRODI Mahasiswa      : " + prodi);
                System.out.println("Semester Mahasiswa   : " + semester);
                System.out.println("Jumlah SKS Mahasiswa : " + sksAmbil);


            }catch (Exception exp){
                // catch adalah kondisi ada error, apa yang ingin ditampilkan
                System.out.println(exp.getMessage());
                System.out.println("Isian semester dan sks harus angka");
            }
        }
    }


