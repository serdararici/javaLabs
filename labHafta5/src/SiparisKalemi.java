public class SiparisKalemi {
    Urun urun;
    Siparis siparis;
    int miktar;
    SiparisKalemi(Urun urun, Siparis siparis, int miktar){
        this.urun = urun;
        this.siparis = siparis;
        this.miktar = miktar;
    }


    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
    public String toString(){
        return getUrun().toString() + " * Ürün Miktarı: " + getMiktar();
    }
}
