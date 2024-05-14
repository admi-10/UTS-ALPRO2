package UTS_AlPro2;

//Metode Do-While
import java.util.Scanner;
public class apl_kalkulator3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("Kalkulator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi yang diinginkan (1-5) : ");
            pilihan = input.nextInt();
            
            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama : ");
                double angka1 = input.nextDouble();
                
                System.out.print("Masukkan angka kedua : ");
                double angka2 = input.nextDouble();
                
                double hasil = 0;
                switch (pilihan) {
                    case 1:
                        hasil = angka1 + angka2;
                        System.out.println("Hasil : " + hasil);
                        break;
                    case 2:
                        hasil = angka1 - angka2;
                        System.out.println("Hasil : " + hasil);
                        break;
                    case 3:
                        hasil = angka1 * angka2;
                        System.out.println("Hasil : " + hasil);
                        break;
                    case 4:
                        if (angka2 != 0) {
                            hasil = angka1 / angka2;
                            System.out.println("Hasil : " + hasil);
                        } else {
                            System.out.println("Pembagian oleh nol tidak valid!");
                        }
                        break;
                    default:
                        break;
                }
            } else if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih angka 1-5.");
            }
        } while (pilihan != 5);
        
        input.close();
    }
}