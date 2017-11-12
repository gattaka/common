package cz.gattserver.common.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class CZSuffixFormatterTest {

	@Test
	public void testSuffix() {
		CZSuffixFormatter formatter = new CZSuffixFormatter("kostka", "kostky", "kostek");
		assertEquals(formatter.format(null), "-");
		assertEquals(formatter.format(0), "-");
		assertEquals(formatter.format(1), "1 kostka");
		assertEquals(formatter.format(2), "2 kostky");
		assertEquals(formatter.format(5), "5 kostek");

		formatter = new CZSuffixFormatter("kostka", "kostky", "kostek", "nic");
		assertEquals(formatter.format(null), "nic");
		assertEquals(formatter.format(0), "nic");
	}

}
