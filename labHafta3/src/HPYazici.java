public class HPYazici implements IYaziciArayuzu {
    public void ac(){
        System.out.println("HP yazıcısı açıldı.");
    }
    public void yazdir(String mesaj){
        System.out.println("HP yazıcı : yazdır -> " + mesaj);
    }
    public void kapat(){
        System.out.println("HP yazıcısı kapatıldı.");
    }
}
