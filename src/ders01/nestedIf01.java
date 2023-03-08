package ders01;

import java.util.Scanner;

public class nestedIf01 {
    public static void main(String[] args) {


        /* Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("Lütfen ürün liste fiyatını giriniz");
        int urunFiyatListesi = scan.nextInt();

        System.out.println("Müşteri kartınız var mı?");
        char kartSahipligi = scan.next().charAt(0);

        if (kartSahipligi == 'e') {
            if (urunAdedi > 10) {
                System.out.println(urunFiyatListesi * urunAdedi * 0.8);

            } else {
                System.out.println(urunFiyatListesi * urunAdedi * 0.85);

            }
        } else if (kartSahipligi == 'h') {
            if (urunAdedi > 10) {
                System.out.println(urunFiyatListesi * urunAdedi * 0.85);

            } else {
                System.out.println(urunFiyatListesi * urunAdedi * 0.9);

            }
        } else {
            System.out.println("Yanlış kart girişi yapılmıştır");
        }
    }
}
