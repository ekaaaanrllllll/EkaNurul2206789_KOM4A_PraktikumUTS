/*
 EKA NURUL BARIDAH (2206789)
 PENDIDIKAN ILMU KOMPUTER A

 SOAL 1 :
Tulis program dalam bahasa Java yang secara acak menghasilkan bilangan bulat antara 
1 dan 12 dan menampilkan nama bulan bahasa Indonesia Januari, Februari, …, 
Desember untuk nomor 1, 2, …, 12, yang sesuai.
 */

package uts;
import java.util.Random;

public class No1 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int nomorBulan = rand.nextInt(12) + 1;
        
        switch(nomorBulan) {
            case 1:
                System.out.println("1: Januari");
                break;
            case 2:
                System.out.println("2: Februari");
                break;
            case 3:
                System.out.println("3: Maret");
                break;
            case 4:
                System.out.println("4: April");
                break;
            case 5:
                System.out.println("5: Mei");
                break;
            case 6:
                System.out.println("6: Juni");
                break;
            case 7:
                System.out.println("7: Juli");
                break;
            case 8:
                System.out.println("8: Agustus");
                break;
            case 9:
                System.out.println("9: September");
                break;
            case 10:
                System.out.println("10: Oktober");
                break;
            case 11:
                System.out.println("11: November");
                break;
            case 12:
                System.out.println("12: Desember");
                break;
            default:
                System.out.println("Nomor bulan tidak valid");
        }
    }
}

