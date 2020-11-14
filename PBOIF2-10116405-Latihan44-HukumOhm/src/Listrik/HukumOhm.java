package Listrik;
/**
 * @author Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * Deskripsi Program : Program menghitung hasil tegangan
*/
import java.util.Scanner;

public class HukumOhm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Baterai baterai = new Baterai();
        baterai.Baterai();
        baterai.Baterai(3,12);
        
        System.out.printf("Kuat Arus : %.1f ampere\n",baterai.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm \n",baterai.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt\n",baterai.hitungTegangan());
    }
    
}
