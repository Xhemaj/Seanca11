package senca11;

public class TestAutomobili {

	    public static void main(String[] args) {
	        Automobili automobili1 = new Automobili();
	        automobili1.setMarka("Toyota");
	        automobili1.setModeli("Corolla");

	        Automobili automobili2 = new Automobili("BMW", "X5");

	        automobili1.starto();
	        automobili2.ndalo();

	        System.out.println("Automobili 1: " + automobili1.getMarka() + " " + automobili1.getModeli());
	        System.out.println("Automobili 2: " + automobili2.getMarka() + " " + automobili2.getModeli());
	    }
	}

