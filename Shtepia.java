package senca11;

public class Shtepia {
	
	    private String adresa;
	    private int numriDhomave;
	    private double madhesia;

	    public Shtepia() {
	    }

	    public Shtepia(String adresa, int numriDhomave, double madhesia) {
	        this.adresa = adresa;
	        this.numriDhomave = numriDhomave;
	        this.madhesia = madhesia;
	    }

	    public String getAdresa() {
	        return adresa;
	    }

	    public void setAdresa(String adresa) {
	        this.adresa = adresa;
	    }

	    public int getNumriDhomave () {
	        return numriDhomave;
	    }

	    public void setNumriDhomave (int numriDhomave) {
	        this.numriDhomave = numriDhomave;
	    }

	    public double getMadhesia () {
	        return madhesia;
	    }

	    public void setMadhesia(double madhesia) {
	        this.madhesia = madhesia;
	    }

	    public void hapDritaren() {
	        System.out.println("Dritarja e shtëpisë është hapur.");
	    }

	    public void mbyllDritaren() {
	        System.out.println("Dritarja e shtëpisë është mbyllur.");
	    }

	    public void ndricimiNatyral() {
	        System.out.println("Shtëpia është e ndriçuar natyrshëm me dritë diellit.");
	    }
	}