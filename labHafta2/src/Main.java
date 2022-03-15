public class Main {

    public static void main(String[] args) {
        KadroluCalisan kadroluCalisan = new KadroluCalisan("Ali",2000, "aşçı");
        kadroluCalisan.bilgileriGoster();
        Yonetici yonetici = new Yonetici("Serdar",10000,"IT");
        yonetici.calis();
        yonetici.zamYap(5000);
        yonetici.bilgileriGoster();
        yonetici.maasHesapla(yonetici.maas);
    }
}
