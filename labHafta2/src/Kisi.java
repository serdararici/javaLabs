public class Kisi {
    String isim;
    int maas;
    String bolum;

    public Kisi(String isim,int maas,String bolum){
        this.isim=isim;
        this.maas=maas;
        this.bolum=bolum;
    }

    public void calis(){
        System.out.println(isim + " çalışmaya başladı.");
    }
    public void bilgileriGoster(){
        System.out.println("İsim: " + isim + " - Maaş: " + maas + " -  Bölüm: " + bolum);
    }
}
