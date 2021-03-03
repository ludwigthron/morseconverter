package morse;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


class MorseTest {
	
	
	@Test
	public void convertLetterToDot() {
		//Arange
		Converter c = new Converter();
		//Act
		String convert = c.convert("E");
		//Assert
		assertEquals(". ", convert);
	}
	@Test
	public void convertNumberToMorse() {
		Converter c = new Converter();
		
		String convert = c.convert("4");
		
		assertEquals("....- ", convert);
	}
	@Test
	public void convertMorseToLetter() {
		Converter c = new Converter();
		
		String convert = c.convert("....");
		
		assertEquals("h", convert);
	}
	@Test
	public void convertMorseToNumber() {
		Converter c = new Converter();
		
		String convert = c.convert("--...");
		
		assertEquals("7", convert);
	}
	@Test
	public void convertMorseToWord() {
		Converter c = new Converter();
		
		String convert = c.convert("-- --- .-. ... . -.-. --- -.. .");
		
		assertEquals("morsecode", convert);
	}
	@Test
	public void convertLetterToHyphen() {
		Converter c = new Converter();
		
		String convert = c.convert("T");
		
		assertEquals("- ", convert);
	}
	@Test
	public void convertWordToMorse() {
		Converter c = new Converter();
		
		String convert = c.convert("Hej");
		
		assertEquals(".... . .--- ", convert);
	}
	/*@Test
	public void convertNumberToMorse() {
		Converter c = new Converter();
		
		String convert = c.convert("4");
		
		assertEquals("....- ", convert);
	}*/
	/*@Test
	public void convertMorseToLetter() {
		Converter c = new Converter();
		
		String convert = c.convert("....");
		
		assertEquals("h", convert);
	}*/
	/*@Test
	public void convertMorseToNumber() {
		Converter c = new Converter();
		
		String convert = c.convert("--...");
		
		assertEquals("7", convert);
	}*/
	/*@Test
	public void convertMorseToWord() {
		Converter c = new Converter();
		
		String convert = c.convert("-- --- .-. ... . -.-. --- -.. .");
		
		assertEquals("morsecode", convert);
	}*/
	
}
