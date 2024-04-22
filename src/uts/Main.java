/*
EKA NURUL BARIDAH (2206789)
PENDIDIKAN ILMU KOMPUTER A

 SOAL 4 :
Buatlah kelas LimasSegiEmpat dan kelas Main untuk testernya sesuai dengan 
ketentuan pada gambar diagram kelas tersebut, dengan rumus balok :
1) Volume Limas Segiempat : V = 1/3 x luas alas x tinggi
2) Luas Limas Segiempat: L = luas alas + luas selubung limas
 */
package uts;

   public class Main {
    public static void main(String[] args) {
        // Membuat objek limas segiempat
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1, 1, 1);
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        // Menampilkan informasi tentang limas segiempat 1
        limas1.printInfo();
        System.out.println();

        // Menampilkan informasi tentang limas segiempat 2
        limas2.printInfo();
        System.out.println();

        // Menampilkan informasi tentang limas segiempat 3
        limas3.printInfo();
    }
}

       