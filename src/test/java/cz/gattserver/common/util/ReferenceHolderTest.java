package cz.gattserver.common.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class ReferenceHolderTest {

	@Test
	public void test() {
		BigDecimal bd = new BigDecimal(4.255);
		ReferenceHolder<BigDecimal> holder = new ReferenceHolder<>();
		holder.setValue(bd);
		assertEquals(bd, holder.getValue());
	}

	@Test
	public void test_staticInteger() {
		Integer i = new Integer(15);
		ReferenceHolder<Integer> holder = ReferenceHolder.newIntegerHolder();
		holder.setValue(i);
		assertEquals(i, holder.getValue());
	}

	@Test
	public void test_staticInteger2() {
		Integer i = new Integer(15);
		ReferenceHolder<Integer> holder = ReferenceHolder.newIntegerHolder(i);
		assertEquals(i, holder.getValue());
	}

	@Test
	public void test_staticBoolean() {
		Boolean b = Boolean.TRUE;
		ReferenceHolder<Boolean> holder = ReferenceHolder.newBooleanHolder();
		holder.setValue(b);
		assertEquals(b, holder.getValue());
	}

	@Test
	public void test_staticBoolean2() {
		Boolean b = Boolean.TRUE;
		ReferenceHolder<Boolean> holder = ReferenceHolder.newBooleanHolder(b);
		assertEquals(b, holder.getValue());
	}

}
