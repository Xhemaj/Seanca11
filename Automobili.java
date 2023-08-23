package senca11;

public class Automobili {

	    private String marka;
	    private String modeli;

	    public Automobili() {
	    }

	    public Automobili(String marka, String modeli) {
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

	    public void starto() {
	        System.out.println("Automobili " + marka + " " + modeli + " është nisur.");
	    }

	    public void ndalo() {
	        System.out.println("Automobili " + marka + " " + modeli + " është ndalur.");
	    }
	}
