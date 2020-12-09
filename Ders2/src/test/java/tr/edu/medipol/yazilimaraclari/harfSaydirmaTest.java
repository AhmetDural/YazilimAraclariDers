package tr.edu.medipol.yazilimaraclari;
import static org.junit.Assert.*;
import org.junit.Test;

 public class harfSaydirmaTest {

	@Test
	public void testHarfleriSaydir() {
        
        String cumle = "Medipol Universitesi";
        
        int sonuc = harfSaydýrma.harfleriSaydir(cumle);
        
        assertEquals(19, sonuc);
    }

 }