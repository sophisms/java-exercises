import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class testCalculator {

	@Test
	public void testSuma() {
		Calculator c = new Calculator();
		Assertions.assertEquals(5, c.sum(3,2));
		Assertions.assertEquals(8, c.sum(6,2));
		Assertions.assertEquals(10, c.sum(5,5));
	}//testSuma
	
	@Test
	public void testMult() {
		Calculator c = new Calculator();
		Assertions.assertEquals(6, c.mult(3,2));
		Assertions.assertEquals(12, c.mult(6,2));
		Assertions.assertEquals(25, c.mult(5,5));
	}//testMult
	
	@Test
	public void testPI() {
		Calculator c = new Calculator();
		Assertions.assertTrue(
		(c.getPI()>=3.14159 && c.getPI()<=3.1416)
		);//assertions w/conditionals
	}//testPI
	
	@Test
	public void testStrPI() {
		Calculator c = new Calculator();
		Assertions.assertNotNull(c.getStrPI());
		Assertions.assertTrue(c.getStrPI().length()>0);
		Assertions.assertTrue(c.getStrPI().indexOf(".")==1);
	}//testStrPI
	
	@Test
	public void testDiv() {
		Calculator c = new Calculator();
		Exception exception = Assertions.assertThrows(ArithmeticException.class, ()->c.div(9, 0));
		Assertions.assertEquals("/ by zero", exception.getMessage());
		Assertions.assertEquals(3, c.div(9, 3));
	}//testDiv
	
	@Test
	public void testEmail() throws EmailFormatException{
		Calculator c = new Calculator();
		Exception exception = Assertions.assertThrows(EmailFormatException.class,()->c.setEmail("alonsograjeda&generation.org"));//checa que sí se haya lanzado una excepción
		Assertions.assertEquals("The format of email is invalid", exception.getMessage());
		Assertions.assertEquals("alonso.grajeda@generations.org", c.setEmail("alonso.grajeda@generations.org"));//si el correo está bien, lo guarda
	}//testEmail

}//class testCalculator
