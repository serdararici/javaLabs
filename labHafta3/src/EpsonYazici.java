public class EpsonYazici implements IYaziciArayuzu{
    public void ac(){
        System.out.println("Epson yazıcısı açıldı.");
    }
    public void yazdir(String mesaj){
        System.out.println("Epson yazıcı : yazdır -> " + mesaj);
    }
    public void kapat(){
        System.out.println("Epson yazıcısı kapatıldı.");
    }
}
