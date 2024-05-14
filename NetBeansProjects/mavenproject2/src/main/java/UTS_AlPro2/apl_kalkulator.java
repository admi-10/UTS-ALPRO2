package UTS_AlPro2;

//Metode If-Else-(Elseif)
import java.util.Scanner;
public class apl_kalkulator {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tarifPerKm = 3500;
        double bonus = 0;
        
        System.out.print("Masukkan jarak perjalanan (km) : ");
        double jarak = input.nextDouble();
        
        if (jarak > 20) {
            bonus = (jarak-20)*1000; // Bonus per kilometer tambahan
            jarak = 20; // Hanya menghitung tarif untuk 20 kilometer pertama
        }
        
        double biayaPerjalanan = jarak*tarifPerKm+bonus;
        
        System.out.println("Biaya perjalanan : Rp " + biayaPerjalanan);
        
        input.close();
    }
}
