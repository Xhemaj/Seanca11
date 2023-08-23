package senca11;

public class Automjeti {
    private String marka;
    private String modeli;

    public Automjeti() {
    }

    public Automjeti(String marka, String modeli) {
        this.marka = marka;
        this.modeli = modeli;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public void nis() {
        System.out.println("Automjeti po niset.");
    }

    public void ndalo() {
        System.out.println("Automjeti po ndalet.");
    }
}

