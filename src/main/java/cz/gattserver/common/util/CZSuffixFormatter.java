package cz.gattserver.common.util;

/**
 * Formátovač určený pro přidávání českých suffixů dle počtu věci. Řeší
 * tvarování popisků -- například:
 * <ul>
 * <li>1 kostka</li>
 * <li>3 kostky</li>
 * <li>8 kostek</li>
 * </ul>
 * 
 * @author Hynek
 *
 */
public class CZSuffixFormatter {

	private static final String DEFAULT_NULL_VALUE = "-";

	private String suf1, suf2to4, suf5AndMore, nullValue;

	/**
	 * 
	 * @param suf1
	 *            suffix pro počet 1
	 * @param suf2to4
	 *            suffix pro počty 2 až 4
	 * @param suf5AndMore
	 *            suffix pro počty 5 a více
	 */
	public CZSuffixFormatter(String suf1, String suf2to4, String suf5AndMore) {
		this(suf1, suf2to4, suf5AndMore, DEFAULT_NULL_VALUE);
	}

	/**
	 * 
	 * @param suf1
	 *            suffix pro počet 1
	 * @param suf2to4
	 *            suffix pro počty 2 až 4
	 * @param suf5AndMore
	 *            suffix pro počty 5 a více
	 * @param nullValue
	 *            hodnota pro výpis pro případ 0 a <code>null</code>
	 */
	public CZSuffixFormatter(String suf1, String suf2to4, String suf5AndMore, String nullValue) {
		this.suf1 = suf1;
		this.suf2to4 = suf2to4;
		this.suf5AndMore = suf5AndMore;
		this.nullValue = nullValue;
	}

	/**
	 * Zformátuje číslo dle zadaných suffixů a nullValue
	 * 
	 * @param number
	 *            číslo na zformátování
	 * @return číslo jako text se suffixem
	 */
	public String format(Integer number) {
		if (number == null)
			return nullValue;
		switch (number) {
		case 0:
			return nullValue;
		case 1:
			return number + " " + suf1;
		case 2:
		case 3:
		case 4:
			return number + " " + suf2to4;
		default:
			return number + " " + suf5AndMore;
		}
	}

}
