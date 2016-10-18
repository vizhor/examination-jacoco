package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversor() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	
	@Test
	public void testConversor2() {
		Conversor conversor2 = new Conversor();
		conversor2.setGenderConverterArrayValues();
		assertEquals(conversor2.getGenderConverterArray().get(0), "man!");
	}
	
	@Test
	public void testConversor3() {
		Conversor conversor3 = new Conversor();
		conversor3.setAgeConverterArrayValues();
		assertEquals(conversor3.getAgeConverterArray().get(1), "You are experienced and talented! Things will come your way soon enough!");
	}
	
	@Test
	public void testconversor4() {
		Conversor conversor4 = new Conversor();
		conversor4.setCityConverterArrayValues();
		assertEquals(conversor4.getCityConverterArray().get(0), " A, ");
	}

}
