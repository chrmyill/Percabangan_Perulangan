package Latihan_Perulangan;

public class LatihanLooping1 {
    public static void main(String[] args) {

        // mencetak angka 1-10 (menggunakan kondisi for)
        // shortcut public static void main = psvm
        // shortcut system.ou.printl (mencetak) = sout
        // shortcut for = fori

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        //Mencetak kata i love u sebanyak 100x
        for (int i = 1; i <= 100; i++) {
            System.out.println("I Love U");

        }
        //Mencetak secara tidak terhingga (Infinite Loop)
        // for (int i = 1; i <= 100 ; i--) {
        //      System.out.println("I Love U");

        //Mencetak penjumlahan angka dari 1-10 (1+2+3+4+5...+10)
        int n = 11;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
            // cara membaca sum += (sum = sum+1)
            /* i = 0
                   0 < 11? ya
                   sum = 0+1 = 1
               i = 1
                   1 < 11? ya
                   sum = 1+1 = 2
               i = 2
                   2 < 11? ya
                   sum = 2+2 = 4
               i = 3
                   3 < 11? ya
                   sum = 3+3 = 6

            */

        }
        // cetak hasil akhir diluar penjumlahan ( diluar kondisi for)
        System.out.println("hasil = " + sum);

        // penjumlahan 10+9+8+7+6+5+4+3+2+1 ( cara 1)
        int j = 0;
        int s = 0;
        for (int i = 10; i > j; i--) {
            s+= i;//(sum = sum+i)

        }
        System.out.println("hasil = " + s);

    // penjumlahan 10+9+8+7+6+5+4+3+2+1 ( cara 2)
        int x = 10;
        int su = 0;
        for (int i = x; i > 0 ; i--) {
            su += i; //(sum = sum+i)
        }
        System.out.println("hasil = " + su );
    }
    // nested for (for bertingkat)
    // for -> outer
    //      for -> inner
    // outerloop = baris ( bagian luar)
    // innerloop = kolom ( bagian dalam)

}
