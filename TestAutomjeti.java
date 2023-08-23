package senca11;

public class TestAutomjeti {
	
	    public static void main(String[] args) {
	        Automjeti automjeti1 = new Automjeti();
	        automjeti1.setMarka("Toyota");
	        automjeti1.setModeli("Corolla");

	        Automjeti automjeti2 = new Automjeti("Honda", "Civic");

	        automjeti1.nis();
	        automjeti2.ndalo();

	        System.out.println("Automjeti 1: " + automjeti1.getMarka() + " " + automjeti1.getModeli());
	        System.out.println("Automjeti 2: " + automjeti2.getMarka() + " " + automjeti2.getModeli());
	    }
	}
