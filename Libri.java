package senca11;

public class Libri {
	  private String titulli;
	    private String autor;

	    public Libri() {
	    }

	    public Libri(String titulli, String autor) {
	        this.titulli = titulli;
	        this.autor = autor;
	    }

	    public String getTitulli() {
	        return titulli;
	    }

	    public void setTitulli(String titulli) {
	        this.titulli = titulli;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public void lexo() {
	        System.out.println("Duke lexuar librin: " + titulli);
	    }

	    public void shenoFaqen(int faqa) {
	        System.out.println("Duke shënuar faqen " + faqa + " të librit: " + titulli);
	    }
	}
