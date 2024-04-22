/*
EKA NURUL BARIDAH (2206789)
PENDIDIKAN ILMU KOMPUTER A

 SOAL 2 :
Tulis sebuah program yang membaca sejumlah bilangan bulat yang tidak ditentukan, 
menentukan berapa banyak nilai positif dan negatif yang telah dibaca, dan menghitung 
total dan rata-rata nilai input (tidak termasuk nol). Program Anda diakhiri dengan 
input 0. Tampilkan rata-rata sebagai angka floating-point.
 */
package uts;

import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nilai;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int jumlahBilangan = 0;
        
        System.out.print("Masukan bilangan integer, program akan berhenti jika memasukan nilai 0: ");
        
        do {
            nilai = scanner.nextInt();
            
            if (nilai > 0) {
                jumlahPositif++;
                total += nilai;
            } else if (nilai < 0) {
                jumlahNegatif++;
                total += nilai;
            }
            
            // Menambah jumlah bilangan jika bukan nol
            if (nilai != 0) {
                jumlahBilangan++;
            }
        } while (nilai != 0);
        
        // Menghitung rata-rata nilai
        double rataRata = (jumlahBilangan == 0) ? 0 : total / jumlahBilangan;
        
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata " + rataRata);
        
        scanner.close();
    }
}
