package tr.edu.medipol.yazilimaraclari;
import static org.junit.Assert.*;
import org.junit.Test;

 public class harfSayd�rmaTest {

	@Test
	public void testHarfleriSaydir() {
        
        String cumle = "Medipol Universitesi";
        
        int sonuc = harfSayd�rma.harfleriSaydir(cumle);
        
        assertEquals(19, sonuc);
    }

 }