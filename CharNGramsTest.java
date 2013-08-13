import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CharNGramsTest{
	
	@Test
	public void test_returnFile(){
		CharNGrams c = new CharNGrams();
		assertEquals("",c.getFile());
	}

	@Test
	public void test_get1Grams(){
		CharNGrams c = new CharNGrams();
		assertEquals("a,b,c,d",c.oneGramsToString());
	}

}
