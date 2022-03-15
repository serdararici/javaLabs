public class Yonetici extends Kisi {
    Yonetici(String isim, int maas, String bolum){
        super(isim,maas,bolum);

    }

    public void zamYap(int zam){
        int yeniMaas = maas+zam;
        System.out.println("Eski maaş: " + maas + ".\n"
                            +"Yapılan zam: " + zam + ".\n"
                            +"Yeni maaş: " + yeniMaas + ".");
    }
    public void maasHesapla(int maas){
        System.out.println("Maşınız " + maas + " TL olarak hesaplanmıştır.");
    }
}
