package senca11;

public class Lopa {
	   private String emri;
	    private int mosha;
	    private double pesha;

	    public Lopa() {
	    }

	    public Lopa(String emri, int moshau, double pesha) {
	        this.emri = emri;
	        this.mosha = moshau;
	        this.pesha = pesha;
	    }

	    public String getEmri() {
	        return emri;
	    }

	    public void setEmri(String emri) {
	        this.emri = emri;
	    }

	    public int getMoshau() {
	        return mosha;
	    }

	    public void setMoshau(int moshau) {
	        this.mosha = moshau;
	    }

	    public double getPesha() {
	        return pesha;
	    }

	    public void setPesha(double pesha) {
	        this.pesha = pesha;
	    }

	    public void mbjellBime() {
	        System.out.println("Lopa " + emri + " po mbjell bimë.");
	    }

	    public void ushqej() {
	        System.out.println("Lopa " + emri + " po ushqehet.");
	    }

	    public void mblidhQumesht() {
	        System.out.println("Lopa " + emri + " ka mblidhur " + pesha + " kg qumësht.");
	    }
	}
