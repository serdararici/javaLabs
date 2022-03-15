public class Main {

    public static void main(String[] args) {
        YaziciSurucusu yaziciSurucusu1 = new YaziciSurucusu(new HPYazici());
        yaziciSurucusu1.ac();
        yaziciSurucusu1.yazdir("BAŞARILI!!");
        yaziciSurucusu1.kapat();
        System.out.println("*********************************************");
        YaziciSurucusu yaziciSurucusu2 = new YaziciSurucusu(new CanonYazici());
        yaziciSurucusu2.ac();
        yaziciSurucusu2.yazdir("BAŞARILI!!");
        yaziciSurucusu2.kapat();
        System.out.println("*********************************************");
        YaziciSurucusu yaziciSurucusu3 = new YaziciSurucusu(new EpsonYazici());
        yaziciSurucusu3.ac();
        yaziciSurucusu3.yazdir("BAŞARILI!!");
        yaziciSurucusu3.kapat();

    }
}
