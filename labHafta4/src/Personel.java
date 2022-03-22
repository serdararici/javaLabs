public class Personel extends Kisi{
    int sicilNo;
    String bolum;
    public Personel(int id, String ad, String soyad, Adres evAdresi, int sicilNo, String bolum){
        super(id, ad, soyad, evAdresi);
        this.sicilNo = sicilNo;
        this.bolum = bolum;

    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public String toString(){
        return "Personel-->" + getId() + "," + getAd() + ","+ getSoyad()+ "," + getEvAdresi()
                + "," + getSicilNo() + "," +getBolum();
    }
}
