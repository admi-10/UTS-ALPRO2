package UTS_AlPro2;

//Metode Get-Set
import java.util.Scanner;
public class apl_kalkulator4 {
    private double angka1;
    private double angka2;

    public double getAngka1() {
        return angka1;
    }

    public void setAngka1(double angka1) {
        this.angka1 = angka1;
    }

    public double getAngka2() {
        return angka2;
    }

    public void setAngka2(double angka2) {
        this.angka2 = angka2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        apl_kalkulator4 kalkulator = new apl_kalkulator4();

        System.out.print("Masukkan angka pertama: ");
        kalkulator.setAngka1(input.nextDouble());

        System.out.print("Masukkan angka kedua: ");
        kalkulator.setAngka2(input.nextDouble());

        System.out.println("Hasil penjumlahan: " + (kalkulator.getAngka1() + kalkulator.getAngka2()));
        System.out.println("Hasil pengurangan: " + (kalkulator.getAngka1() - kalkulator.getAngka2()));
        System.out.println("Hasil perkalian: " + (kalkulator.getAngka1() * kalkulator.getAngka2()));
        if (kalkulator.getAngka2() != 0) {
            System.out.println("Hasil pembagian: " + (kalkulator.getAngka1() / kalkulator.getAngka2()));
        } else {
            System.out.println("Pembagian oleh nol tidak valid!");
        }

        input.close();
    }
}