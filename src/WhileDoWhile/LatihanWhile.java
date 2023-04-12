package WhileDoWhile;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanWhile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //while
        //menjumlah setiap angka yang di entrykan
        //kondisi: pengulangan, penjumlahan akan dilakukan apabila angka yang dinputkan >=0
        //output : angka hasil jumlah

    /*    int number = 0, jumlah = 0;
        while (number >= 0) {
            jumlah += number; // untuk penjumlahan setiap angka yang di inputkan

            // += berfungsi untuk menjumlahkan (jumlah + angka ( 0+0 = 0 , 0+3 = 3 )



            System.out.print("Entry Angka  : ");
            number = Integer.parseInt(br.readLine());
        }

        System.out.print("Jumlah  =" + jumlah);
   */
         // Entry NIM dan NAMA apabila kondisi true ( dua data yaitu nim dan angka diisi dengan benar, dimana tipe datanya sesuai)

        boolean b;
        int i = 0;
        while (i < 5) {
            System.out.print("Entry NIM     : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Entry Nama    : ");
            String nama = br.readLine();
            i++; // untuk perulangan dan setiap perulangan akan ditambah kan 1 (+1)
                // jika tanpa i++ akan mengulang dan tidak berhenti di while i < 5
        }
    }
}
