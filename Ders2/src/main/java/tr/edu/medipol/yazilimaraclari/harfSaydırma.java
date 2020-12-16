package tr.edu.medipol.yazilimaraclari;

public class harfSaydýrma {

	public static void main(String[] args) {

		   String Cumle = "Medipol Universitesi";
	        int harfSayisi = harfleriSaydir(Cumle);
	        System.out.printf("%s cumledeki harf sayisi: %d", Cumle, harfSayisi);
	    }

	 

	    static int harfleriSaydir(String Cumle) {
	        
	        int harfSayisi = 0;
	        for (int i = 0; i < Cumle.length(); i++) {
	            char karakter = Cumle.charAt(i);
	            if ( Character.isAlphabetic(karakter) ) {
	                harfSayisi++;
	            }
	        }
	        
	        return harfSayisi;
	    }
}
