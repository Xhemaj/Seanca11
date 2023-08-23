package senca11;

public class TestLopa {
	    public static void main(String[] args) {
	        Lopa lopa1 = new Lopa();
	        lopa1.setEmri("Bardha");
	        lopa1.setMoshau(5);
	        lopa1.setPesha(450);

	        Lopa lopa2 = new Lopa("Kuqi", 4, 400);

	        lopa1.mbjellBime();
	        lopa2.ushqej();
	        lopa1.mblidhQumesht();

	        System.out.println("Lopa 1: " + lopa1.getEmri() + " moshau " + lopa1.getMoshau() + " vjeç");
	        System.out.println("Lopa 2: " + lopa2.getEmri() + " moshau " + lopa2.getMoshau() + " vjeç");
	    }
	}
	


