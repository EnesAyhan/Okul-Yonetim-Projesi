package OkulYonetimPaneli;

public class Ogrenci extends Kisi {

    private String ogrcNo;
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrcNo = ogrcNo;
        this.sinif = sinif;
    }

    public String getOgrcNo() {
        return ogrcNo;
    }

    public void setOgrcNo(String ogrcNo) {
        this.ogrcNo = ogrcNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrcNo='" + ogrcNo + '\'' +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}
