import java.util.Random;

public class RastgeleUretmeAraci {
    int rastgeleSayiUret(int sayi){
        Random r=new Random(); //random sınıfı
        int a= (r.nextInt(sayi));
        return a;
    }
    String rastgeleKelimeUret(int length){
        String alphabet = "abcdefgğhıijklmnoöpqrsştuüvwyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i<length; i++){
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString;
    }

}
