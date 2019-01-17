package zodiak;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class Zodiak {

    public static void main(String[] args) {
        int tanggal, bulan;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Tanggal Lahir : ");
        tanggal = scanner.nextInt();
        
        System.out.println("Masukkan Kode Bulan : ");
        bulan = scanner.nextInt();
        
        if ((tanggal >= 21 && bulan == 3) || (tanggal <= 19 && bulan == 4)) {
            System.out.println("Zodiak Kamu Aries");
        } else if((tanggal >= 20 && bulan == 4) || (tanggal <= 20 && bulan == 5)) {
            System.out.println("Zodiak Kamu Taurus");
        } else if((tanggal >= 21 && bulan == 5) || (tanggal <= 20 && bulan == 6)){
            System.out.println("Zodiak Kamu Gemini");
        } else if((tanggal >= 21 && bulan == 6) || (tanggal <= 22 && bulan == 7)){
            System.out.println("Zodiak Kamu Cancer");
        } else if((tanggal >= 23 && bulan == 7) || (tanggal <= 22 && bulan == 8)){
            System.out.println("Zodiak Kamu Leo");
        } else if((tanggal >= 23 && bulan == 8) || (tanggal <= 22 && bulan == 9)){
            System.out.println("Zodiak Kamu Virgo");
        } else if((tanggal >= 23 && bulan == 9) || (tanggal <= 22 && bulan == 10)){
            System.out.println("Zodiak Kamu Libra");
        } else if((tanggal >= 23 && bulan == 10) || (tanggal <= 21 && bulan == 11)){
            System.out.println("Zodiak Kamu Scorpio");
        } else if((tanggal >= 22 && bulan == 11) || (tanggal <= 21 && bulan == 12)){
            System.out.println("Zodiak Kamu Sagitarius");
        } else if((tanggal >= 22 && bulan == 12) || (tanggal <= 19 && bulan == 1)){
            System.out.println("Zodiak Kamu Capricorn");
        } else if((tanggal >= 20 && bulan == 1) || (tanggal <= 18 && bulan == 2)){
            System.out.println("Zodiak Kamu Aquarius");
        } else {
            System.out.println("Zodiak Kamu Pisces");
        }
    }         
    
    
}
