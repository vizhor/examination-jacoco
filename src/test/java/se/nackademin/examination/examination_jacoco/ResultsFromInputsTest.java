package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	}
	@Test
	public void testAgeGettersAndSettersMethods2() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForGender(), 10);
	}
	@Test
	public void testAgeGettersAndSettersMethods3() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForAge(), 10);
	}
	@Test
	public void testAgeGettersAndSettersMethods4() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForHomeCity(), 10);
	}

}
