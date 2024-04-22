/*
EKA NURUL BARIDAH (2206789)
PENDIDIKAN ILMU KOMPUTER A

 SOAL 3 :
(Jumlah digit dalam bilangan bulat) Tulis metode yang menghitung jumlah digit dalam 
bilangan bulat. Gunakan tajuk metode berikut :
public static int sumDigits(long n)

contoh :
Misalnya, sumDigits(234) mengembalikan 9 (2 + 3 + 4). (Petunjuk: Gunakan operator 
% untuk mengekstrak digit, dan operator / untuk menghapus digit yang diekstraksi. 
Misalnya, untuk mengekstrak 4 dari 234, gunakan 234 % 10 (= 4). Untuk menghapus 
4 dari 234, gunakan 234 / 10 ( = 23). Gunakan loop untuk mengekstrak dan 
menghapus digit berulang kali hingga semua digit terekstraksi. Tulis program 
pengujian yang meminta pengguna memasukkan bilangan bulat dan menampilkan 
jumlah semua digitnya.
*/

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();

        System.out.println("Jumlah digit dalam bilangan adalah: " + sumDigits(number));

        scanner.close();
    }

    public static int sumDigits(long n) {
        // Inisialisasi variabel untuk menyimpan jumlah digit
        int sum = 0;

        // Loop untuk mengekstrak dan menghapus digit berulang kali
        while (n != 0) {
            // Mengekstrak digit terakhir
            int digit = (int) (n % 10);
            // Menambahkan digit ke jumlah total
            sum += digit;
            // Menghapus digit terakhir dari bilangan
            n /= 10;
        }

        // Mengembalikan jumlah digit
        return sum;
    }
}
