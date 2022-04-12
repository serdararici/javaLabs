public class Urun {
    String ad;
    int birimFiyati;
    int stokMiktari;
    Urun(String ad, int birimFiyati, int stokMiktari){
        this.ad = ad;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(int birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public String toString(){
        return "Ürün: " + getAd()+  " * Ürün Fiyatı: " + getBirimFiyati() + " * Ürün Stok Miktarı: "+ getStokMiktari();
    }
}
