public class YaziciSurucusu implements IYaziciArayuzu{
    private IYaziciArayuzu yazici;
    public YaziciSurucusu(IYaziciArayuzu yazici){
        this.yazici = yazici;
    }
    public void ac(){
        yazici.ac();
    }
    public void yazdir(String mesaj){
        yazici.yazdir(mesaj);
    }
    public void kapat(){
        yazici.kapat();
    }

}
