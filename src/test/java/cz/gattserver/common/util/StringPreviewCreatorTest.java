package cz.gattserver.common.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringPreviewCreatorTest {

	@Test
	public void test_normal() {
		assertEquals("text", StringPreviewCreator.createPreview("text", 10));
	}

	@Test
	public void test_long() {
		assertEquals("lo...", StringPreviewCreator.createPreview("longtext", 5));
	}

	@Test
	public void test_short() {
		assertEquals("tex", StringPreviewCreator.createPreview("tex", 3));
	}
	
	@Test
	public void test_short2() {
		assertEquals("...", StringPreviewCreator.createPreview("text", 3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_tooShort() {
		assertEquals("text", StringPreviewCreator.createPreview("text", 2));
	}

}
