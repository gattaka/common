package cz.gattserver.common.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import cz.gattserver.common.util.MoneyFormatter;

public class MoneyFormatterTest {

	@Test
	public void testMoney() {
		assertEquals("200,00 Kč", MoneyFormatter.format(200.0));
		assertEquals("200,00 Kč", MoneyFormatter.format(200));
		assertEquals("200,00 Kč", MoneyFormatter.format(200.005));
		assertEquals("200,90 Kč", MoneyFormatter.format(200.9));
	}
	
	@Test
	public void testMoney2() {
		assertEquals("200,00 Kč", MoneyFormatter.format(new BigDecimal(200.0)));
		assertEquals("200,00 Kč", MoneyFormatter.format(new BigDecimal(200)));
		assertEquals("200,00 Kč", MoneyFormatter.format(new BigDecimal(200.005)));
		assertEquals("200,90 Kč", MoneyFormatter.format(new BigDecimal(200.9)));
	}

}
