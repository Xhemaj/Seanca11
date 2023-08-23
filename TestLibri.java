package senca11;

public class TestLibri {
	 public static void main(String[] args) {
	        Libri libri1 = new Libri();
	        libri1.setTitulli("Krim dhe Ndeshkim");
	        libri1.setAutor("Fyodor Dostoevsky");

	        Libri libri2 = new Libri("1984", "George Orwell");

	        libri1.lexo();
	        libri2.shenoFaqen(50);

	        System.out.println("Libri 1: " + libri1.getTitulli() + " nga " + libri1.getAutor());
	        System.out.println("Libri 2: " + libri2.getTitulli() + " nga " + libri2.getAutor());
	    }
	
}
