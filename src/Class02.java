import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {

        // Kullanıcıdan isim alma
        System.out.print("Adınızı girin: ");
        String isim = "fatma";

        // Kullanıcıdan yaş alma
        System.out.print("Yaşınızı girin: ");
        int yas = 15;


        // Yaşa göre mesaj verme
        mesajVer(isim, yas);

        // Döngü ile 1'den 5'e kadar sayıları yazdırma
        System.out.println("\nŞimdi 1'den 5'e kadar sayılar yazdırılıyor:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Basit bir hesaplama
        System.out.print("\nİki sayı girin (örnek: 3 5): ");
        int sayi1 = 3;
        int sayi2 = 3;

        int toplam = topla(sayi1, sayi2);
        System.out.println("Toplam: " + toplam);

    }

    // Yaşa göre mesaj veren metod
    public static void mesajVer(String isim, int yas) {
        if (yas < 18) {
            System.out.println("Merhaba " + isim + ", reşit değilsin.");
        } else if (yas < 65) {
            System.out.println("Merhaba " + isim + ", yetişkin bir bireysin.");
        } else {
            System.out.println("Merhaba " + isim + ", emeklilik yaşındasın.");
        }
    }

    // İki sayıyı toplayan metod
    public static int topla(int a, int b) {
        return a + b;
    }
}
