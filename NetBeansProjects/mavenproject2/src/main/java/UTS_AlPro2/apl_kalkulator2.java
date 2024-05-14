package UTS_AlPro2;

//Metode Ternary
import java.util.Scanner;
public class apl_kalkulator2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tarifPerKm = 3500;
        
        System.out.print("Masukkan jarak perjalanan (km) : ");
        double jarak = input.nextDouble();
        
        double bonus = (jarak > 20) ? (jarak - 20)*tarifPerKm*0.1:0; 
        
        double biayaPerjalanan = jarak*tarifPerKm+bonus;
        
        System.out.println("Biaya perjalanan : Rp " + biayaPerjalanan);
        
        input.close();
    }
}
