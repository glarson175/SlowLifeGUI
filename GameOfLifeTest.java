import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.*;

public class GameOfLifeTest {
	
	//toString() edit tests
	@Test
	public void testAliveCellToStringBooleanConstructor(){
		Cell cell = new Cell(true);
		assertEquals("X", cell.toString());
	}
	
	@Test public void testAliveCellToStringDefaultConstructor()
	{
		Cell cell = new Cell();
		cell.setAlive(true);
		assertEquals("X", cell.toString());
	}
	
	@Test
	public void testDeadCellToString(){
		Cell cell = new Cell();
		//don't need to set alive because its defaulted to false.
		assertEquals(".", cell.toString());
	}
	
	@Test
	public void testBeenAliveCellToString(){
		Cell cell = new Cell(true);
		cell.setAlive(false);
		assertEquals(".", cell.toString());
	}
	
	//MainPanel.convertToInt()
	@Test
	public void testMainPanel(){
		MainPanel mainPanel = new MainPanel(15);
		int blah = 36;//random value idk
		int convertToIntBlah = mainPanel.convertToInt(blah);
		assertEquals(blah,convertToIntBlah);
	}
	
	@Test
	public void testMainPanelMaxValue(){
		MainPanel mainPanel = new MainPanel(20);
		int blah = Integer.MAX_VALUE;//random value idk
		int convertToIntBlah = mainPanel.convertToInt(blah);
		assertEquals(blah,convertToIntBlah);
	}
	
	@Test
	public void testMainPanelMINValue(){
		MainPanel mainPanel = new MainPanel(20);
		int blah = Integer.MIN_VALUE;//random value idk
		int convertToIntBlah = mainPanel.convertToInt(blah);
		assertEquals(blah,convertToIntBlah);
	}
}