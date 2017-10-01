package cz.gattserver.common.util;

import org.apache.commons.lang3.time.DateUtils;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public final class DateUtil {

	private DateUtil() {
	}

	public static Date resetTime(Date date) {
		return DateUtils.truncate(date, Calendar.DATE);
	}

	public static Date resetTimeToMidnight(Date date) {
		return DateUtils.addSeconds(DateUtils.addMinutes(DateUtils.addHours(resetTime(date), 23), 59), 59);
	}

	public static LocalDate toLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static java.sql.Date toDate(LocalDate locDate) {
    	return java.sql.Date.valueOf(locDate);
    }
}
