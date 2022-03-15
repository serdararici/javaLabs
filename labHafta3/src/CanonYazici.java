public class CanonYazici implements IYaziciArayuzu{
    public void ac(){
        System.out.println("Canon yazıcısı açıldı.");
    }
    public void yazdir(String mesaj){
        System.out.println("Canon yazıcı : yazdır -> " + mesaj);
    }
    public void kapat(){
        System.out.println("Canon yazıcısı kapatıldı.");
    }
}
