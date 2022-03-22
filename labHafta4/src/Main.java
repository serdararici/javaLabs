import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RastgeleUretmeAraci rastgeleUretmeAraci = new RastgeleUretmeAraci();
        int sayi= rastgeleUretmeAraci.rastgeleSayiUret(10);
        String kelime = rastgeleUretmeAraci.rastgeleKelimeUret(5);
        String kelime2 = rastgeleUretmeAraci.rastgeleKelimeUret(5);
        String[] kisi = new String[101];
        int i = 1;
        while(i<101) {
            Adres evAdresi = new Adres(i, kelime, "Doğduğunuz İl");
            if (i % 2 == 0) {
                int sayi1 = rastgeleUretmeAraci.rastgeleSayiUret(10);
                int rndSicilNo = rastgeleUretmeAraci.rastgeleSayiUret(10000);
                String rndAd = rastgeleUretmeAraci.rastgeleKelimeUret(5);
                String rndSoyAd = rastgeleUretmeAraci.rastgeleKelimeUret(5);
                Personel personel = new Personel(i, rndAd, rndSoyAd, evAdresi, rndSicilNo, "bolum");
                kisi[i] = "\n"+personel.toString();

            } else {
                int sayi2 = rastgeleUretmeAraci.rastgeleSayiUret(10);
                int sayi3 = rastgeleUretmeAraci.rastgeleSayiUret(10);
                String rndAd2 = rastgeleUretmeAraci.rastgeleKelimeUret(5);
                String rndTelNo = rastgeleUretmeAraci.rastgeleKelimeUret(5);
                String rndSoyAd2 = rastgeleUretmeAraci.rastgeleKelimeUret(5);
                Adres isAdresi = new Adres(i, kelime2, "Sakarya");
                Musteri musteri = new Musteri(i, rndAd2 ,rndSoyAd2, evAdresi, rndTelNo, isAdresi);
                kisi[i] = "\n"+musteri.toString();
            }
            i++;
        }
        System.out.println(Arrays.toString(kisi));

    }
}
