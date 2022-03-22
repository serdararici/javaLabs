public class Adres {
    int id;
    String adresSatiri;
    String il;
    public Adres(int id, String adresSatiri, String il){
        this.adresSatiri = adresSatiri;
        this.id = id;
        this.il = il;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresSatiri() {
        return adresSatiri;
    }

    public void setAdresSatiri(String adresSatiri) {
        this.adresSatiri = adresSatiri;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }
    public String toString(){
        return getIl();
    }
}
