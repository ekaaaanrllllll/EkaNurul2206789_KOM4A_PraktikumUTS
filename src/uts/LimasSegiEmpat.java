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
public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;
    
    // Constructor tanpa parameter
    public LimasSegiEmpat() {
        luasAlas = 0;
        luasSelubungLimas = 0;
        tinggi = 0;
    }

    // Constructor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungBaru, double tinggiBaru) {
        luasAlas = luasAlasBaru;
        luasSelubungLimas = luasSelubungBaru;
        tinggi = tinggiBaru;
    }
    
    public void printInfo() {
        System.out.println("Limas segi empat, dengan : ");
        System.out.println("luas alas : " + luasAlas + ", ");
        System.out.println("luas selubung limas : " + luasSelubungLimas + ", ");
        System.out.println("tinggi : " + tinggi);
        System.out.println("Luasnya : " + getLuas() + ", sedangkan volumenya : " + getVolume());
    }
    
    // Method untuk menghitung luas limas segiempat
    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Method untuk menghitung volume limas segiempat
    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    // Setter untuk luas alas
    public void setLuasAlas(double luasAlasBaru) {
        luasAlas = luasAlasBaru;
    }

    // Setter untuk luas selubung limas
    public void setLuasSelubung(double luasSelubungBaru) {
        luasSelubungLimas = luasSelubungBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }
}
