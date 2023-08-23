package senca11;

public class TestShtepia {
	    public static void main(String[] args) {
	        Shtepia shtepia1 = new Shtepia();
	        shtepia1.setAdresa("Rruga X");
	        shtepia1.setNumriDhomave(3);
	        shtepia1.setMadhesia(150.5);

	        Shtepia shtepia2 = new Shtepia("Bulevardi Y", 4, 200.0);

	        shtepia1.hapDritaren();
	        shtepia2.ndricimiNatyral();
	        shtepia1.mbyllDritaren();

	        System.out.println("Shtëpia 1 ka " + shtepia1.getNumriDhomave() + " dhoma dhe madhësia është " + shtepia1.getMadhesia() + " m².");
	        System.out.println("Shtëpia 2 ka " + shtepia2.getNumriDhomave() + " dhoma dhe madhësia është " + shtepia2.getMadhesia() + " m².");
	    }
	}