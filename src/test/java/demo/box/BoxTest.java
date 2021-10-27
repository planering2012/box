package demo.box;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoxTest {

	@Test
	public void testGetName() {		
		Box box = new Box("name", 1, "0000FF", "china");
		assertEquals("name", box.getName());
	}

}
