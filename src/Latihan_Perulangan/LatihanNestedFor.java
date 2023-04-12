package Latihan_Perulangan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanNestedFor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       /* // deklarasi variabel
        int minggu, hari;

        //input
        System.out.print("Jumlah minggu :");
        minggu = Integer.parseInt(br.readLine());
        System.out.print("Jumlah hari :");
        hari = Integer.parseInt(br.readLine());

        //perulangan + output
        //outer loop (baris)
        for (int i = 1; i <= minggu ; i++) {
            System.out.println("Minggu ke - " +i);

            //inner loop (kolom)
            for (int j = 1; j <=hari; j++) {
                // if jika tidak ada hari yang ditampilkan pada minggu ke-4
                if (i==4)
                    break;;
                System.out.println("Hari : "+j);
            }

        */
        // Membuat persegi bintang tanpa inputan
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print("*");

            }
            System.out.println();


        }
        //Membuat persegi bintang dengan inputan
        int jumlah;
        System.out.print("Jumlah : ");
        jumlah = Integer.parseInt(br.readLine());
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        //Membuat segitiga bintang tanpa inputan
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        // Membuat segitiga bintang terbalik dengan inputan
        int m;
        System.out.print("Jumlah :");
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        // Membuat Segitiga bintang kebalik dengan inputan
        int z;
        System.out.print("Jumlah :");
        z = Integer.parseInt(br.readLine());
        for (int i = 0; i <= z; i++) {
            for (int j = i; j < z; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
