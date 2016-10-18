package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	@Test
	public void test2() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafa", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result.contains("The first name is smaller"));

	}
	
	@Test
	public void test3() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("The first name is greater or' ",
				result.contains("The first name is greater or"));

	}
	
	
	@Test
	public void test4() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "pp", "lll", "M", "31", "Fortaleza"));
		String result = dataAnalysis.getResultStringNamesAndAge(values);
		assertTrue("No test ",
				result.contains("No analysis was performed"));

	}
	@Test
	public void test5() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "aaa"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("small and the participant is 30 or older ",
				result.contains("the participant is 30 or older"));

	}
	
	@Test
	public void test6() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "aaa"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("small and the participant is younger than 30 ",
				result.contains("the participant is younger than 30"));

	}
	@Test
	public void test7() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "aaaaaa"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("big and the participant is 30 or older",
				result.contains("the participant is 30 or older"));

	}
	@Test
	public void test8() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "aaaaaa"));
		String result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertTrue("big and the participant is younger than 30",
				result.contains("the participant is younger than 30"));

	}
	
	
}
