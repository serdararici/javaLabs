public class Kisi {
    int id;
    String ad;
    String soyad;
    Adres evAdresi;

    Kisi(int id, String ad, String soyad, Adres evAdresi){
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.evAdresi = evAdresi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    public String toString(){
        return "id: " + getId() + "ad: " + getAd() + "soyad: " + getSoyad() + "ev adresi: " + getEvAdresi();
    }
}
