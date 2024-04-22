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
