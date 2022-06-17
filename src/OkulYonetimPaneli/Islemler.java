package OkulYonetimPaneli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static ArrayList<Kisi> ogretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("===== Ogrenci Ogretmen Paneli ======");
        System.out.println("=========== Hosgeldiniz ============");
        System.out.println("====================================");
        System.out.println("== 1 - Ogrenci Islemleri          ==");
        System.out.println("== 2 - Ogretmen Islemleri         ==");
        System.out.println("== E - Cikis                      ==");
        System.out.println("isleminizi seciniz");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "E":
                cikis();
                break;
            default:
                System.out.println("hatali giris yaptiniz");
                girisPaneli();//reacursive method call
                break;
        }


    }

    private static void cikis() {
        System.out.println("yine bekleriz");
    }

    public static void islemMenusu() {
        System.out.println("== " + kisiTuru + " ISLEM MENUSU");
        System.out.println("============= ISLEMLER =============");
        System.out.println("====================================");
        System.out.println("== 1 - Ekleme                     ==");
        System.out.println("== 2 - Arama Yapma                ==");
        System.out.println("== 3 - Listele                    ==");
        System.out.println("== 4 - Silme                      ==");
        System.out.println("== 0 - Ana Menuye Don             ==");
        int secilenİslem = scan.nextInt();

        switch (secilenİslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                islemMenusu();
                break;
            case 4:
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("hatali giris yaptiniz");
                islemMenusu();
                break;

        }


    }

    private static void ekle() {
        System.out.println("   ***   " + kisiTuru + " ekleme sayfasi   ***   ");
        System.out.print("ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("Kimlik no giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("Yas giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCİ")) {
            System.out.print("Ogrenci no giriniz : ");
            scan.nextLine();
            String ogrenciNo = scan.nextLine();
            System.out.print("sinif giriniz : ");
            String sinif = scan.nextLine();
            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);//parametreli constructer'dan ogrenci objesi create edilecek
            ogrenciListesi.add(ogrenci);
        } else {
            System.out.println("Sicil no giriniz : ");
            String sicilNo = scan.nextLine();
            System.out.println("Bolum giriniz : ");
            String bolum = scan.nextLine();
            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            ogretmenListesi.add(ogretmen);
        }

    }

}
