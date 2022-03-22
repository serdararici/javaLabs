public class Musteri extends Kisi{
    String telefonNo;
    Adres isAdresi;
    Musteri(int id,String ad,String soyad,Adres evAdresi,String telefonNo,Adres isAdresi){
        super(id, ad, soyad, evAdresi);
        this.telefonNo = telefonNo;
        this.isAdresi = isAdresi;

    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    public String toString(){
        return "Müşteri --> " + getId() + "," + getAd() + "," + getSoyad() + "," + getEvAdresi()
                + "," + getTelefonNo() + "," + getIsAdresi();
    }
}
