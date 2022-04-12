import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Urun urun1 = new Urun("bilgisayar ", 20000, 100);
        Urun urun2 = new Urun("telefon ", 10000, 300);
        Urun urun3 = new Urun("tablet ", 5000, 200);
        Urun urun4 = new Urun("kulaklık ", 400, 600);
        Urun urun5 = new Urun("saat ", 3000, 250);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sipariş No Giriniz: ");
        int siparisNo1 = scanner.nextInt();
        System.out.print("Siparis Tarihi Giriniz: ");
        String siparisTarihi1 = scanner.next();
        Siparis siparis1 = new Siparis(siparisNo1, siparisTarihi1);
        System.out.println("******************** 2.Sipariş ********************");
        System.out.print("Sipariş No Giriniz: ");
        int siparisNo2 = scanner.nextInt();
        System.out.print("Siparis Tarihi Giriniz: ");
        String siparisTarihi2 = scanner.next();
        Siparis siparis2 = new Siparis(siparisNo2, siparisTarihi2);


        SiparisKalemi siparisKalemi1 = new SiparisKalemi(urun1, siparis1, 3);
        SiparisKalemi siparisKalemi2 = new SiparisKalemi(urun3, siparis2, 5);
        SiparisKalemi siparisKalemi3 = new SiparisKalemi(urun5, siparis1, 4);
        SiparisKalemi siparisKalemi4 = new SiparisKalemi(urun2, siparis2, 1);

        siparis1.sepeteEkle(siparisKalemi1.urun, siparisKalemi1.siparis, siparisKalemi1.miktar);
        siparis1.sepeteEkle(siparisKalemi3.urun, siparisKalemi3.siparis, siparisKalemi3.miktar);
        siparis2.sepeteEkle(siparisKalemi2.urun, siparisKalemi2.siparis, siparisKalemi2.miktar);
        siparis2.sepeteEkle(siparisKalemi4.urun, siparisKalemi4.siparis, siparisKalemi4.miktar);

        //System.out.println(siparisKalemi1);
        System.out.println("******************** 1. Sipariş Bilgileri ********************");
        siparis1.siparisGoster();
        System.out.println("******************** 2. Sipariş Bilgileri ********************");
        siparis2.siparisGoster();
    }
}
