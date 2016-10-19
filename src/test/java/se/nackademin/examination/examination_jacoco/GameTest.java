package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Raf", "Silva");
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testMethod3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafae", "Silva");
		assertEquals("The result should be 2", i, 2);
	}

	@Test
	public void testMethod4() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", g, 0);
	}
	
	@Test
	public void testMethod5() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", g, 1);
	}
	@Test
	public void testMethod6() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnGender('A');
		assertEquals("The result should be 2", g, 2);
	}
	@Test
	public void testMethod7() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnAge(20);
		assertEquals("The result should be 0", g, 0);
	}
	@Test
	public void testMethod8() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnAge(30);
		assertEquals("The result should be 1", g, 1);
	}
	@Test
	public void testMethod9() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("arboga");
		assertEquals("The result should be 0", g, 0);
	}
	@Test
	public void testMethod10() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("Boston");
		assertEquals("The result should be 1", g, 1);
	}
	@Test
	public void testMethod11() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("Charlottenberg");
		assertEquals("The result should be 2", g, 2);
	}
	@Test
	public void testMethod12() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("Dberg");
		assertEquals("The result should be 3", g, 3);
	}
	@Test
	public void testMethod13() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("Eberg");
		assertEquals("The result should be 4", g, 4);
	}
	@Test
	public void testMethod14() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("Fberg");
		assertEquals("The result should be 5", g, 5);
	}
	@Test
	public void testMethod15() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("gberg");
		assertEquals("The result should be 6", g, 6);
	}
	@Test
	public void testMethod16() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("hberg");
		assertEquals("The result should be 7", g, 7);
	}
	@Test
	public void testMethod17() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("iberg");
		assertEquals("The result should be 8", g, 8);
	}
	
	@Test
	public void testMethod18() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("jberg");
		assertEquals("The result should be 9", g, 9);
	}
	@Test
	public void testMethod19() {
		Game game = new Game();
		int g = game.calculateOutPutBasedOnHomeCity("pberg");
		assertEquals("The result should be 10", g, 10);
	}
	@Test
	public void testMethod20() {
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.add("Game1");
		values.add("Viktor");
		values.add("Lofgren");
		values.add("M");
		values.add("26");
		values.add("Stockholm");
		char kon =game.getGenderFromInputValues(values);
		assertEquals("Gender should be M",kon , 'M');
	}
	@Test
	public void testMethod21() {
		Game game = new Game();
		ArrayList<String> age = new ArrayList<String>();
		age.add("22");
		age.add("23");
		age.add("24");
		age.add("25");
		age.add("26");
		age.add("27");
		int alder=game.getAgeFromInputValues(age);
		assertEquals("Age should be 26", alder, 26);
		
		
		
	}
	@Test
	public void testMethod22() {
		Game game = new Game();
		game.runGame("Game", "Viktor", "Lofgren", 'M', 26, "Stockholm");
	}
		
		
	
	@Test
	public void testMethod23(){
	Conversor conversor = new Conversor();
	ResultFromInputs results = new ResultFromInputs();
	Game game = new Game ();
	
	game.buildFinalString("Viktor", "Lofgren", results, conversor);
	
	}
	@Test
	public void testMethod24(){
		Game game = new Game();
		ArrayList<String> values = new ArrayList<String>();
		values.add("Game1");
		values.add("Viktor");
		values.add("Lofgren");
		values.add("M");
		values.add("26");
		values.add("Stockholm");
		
		game.run(values);
	}


}
