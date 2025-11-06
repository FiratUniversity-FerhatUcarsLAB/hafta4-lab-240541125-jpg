/*
 * Ad Soyad: [Şevval BULUT]
 * Ogrenci No: [240541125]
 * Tarih: [6.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        
        import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00 - 4.00): ");
        double gpa = input.nextDouble();

     
        String durum = (gpa >= 2.5) ? "Basarili Ogrenci"
                      : (gpa >= 1.8) ? "Orta Düzey Ogrenci"
                      : "Basarisiz Ogrenci";

   
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad     : %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No   : %d%n", ogrNo);
        System.out.printf("Yas          : %d%n", yas);
        System.out.printf("GPA          : %.2f%n", gpa);
        System.out.printf("Durum        : %s%n", durum);

        input.close();
    }
}
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
    }
}
