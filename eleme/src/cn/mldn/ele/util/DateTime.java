package cn.mldn.ele.util;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	private static final Calendar calendar = Calendar.getInstance();
	public static Timestamp getDateTime(){
		return Timestamp.valueOf(simpleDateFormat.format(calendar.getTime()));
	}
}
