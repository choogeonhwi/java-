package chapter06;

import java.util.Calendar;

public class calendarex {
	public static void printCalendar(String msg, Calendar cal) {
		int y, m, d, w, hd, ampm, h, mi, s, ms;
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH);
		d = cal.get(Calendar.DAY_OF_MONTH);
		w = cal.get(Calendar.DAY_OF_WEEK);
		hd = cal.get(Calendar.HOUR_OF_DAY);
		ampm = cal.get(Calendar.AM_PM);
		h = cal.get(Calendar.HOUR);
		mi = cal.get(Calendar.MINUTE);
		s = cal.get(Calendar.SECOND);
		ms = cal.get(Calendar.MILLISECOND);
		System.out.print(msg + ":" + y + "-" + m + "-" + d + "");
//	System.out.println(w);
//	System.out.println(Calendar.FRIDAY);

		switch (w) {
		case Calendar.SUNDAY:
			System.out.println("일요일");
			break;
		case Calendar.MONDAY:
			System.out.println("월요일");
			break;
		case Calendar.TUESDAY:
			System.out.println("화요일");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("수요일");
			break;
		case Calendar.THURSDAY:
			System.out.println("목요일");
			break;
		case Calendar.FRIDAY:
			System.out.println("금요일");
			break;
		case Calendar.SATURDAY:
			System.out.println("토요일");
			break;

		default:
			break;
		}
		System.out.print("(" + hd + "시)");
		if (ampm == Calendar.AM) {
			System.out.println("오전 ");
		} else {
			System.out.println("오후 ");
		}
		System.out.println(h + "시" + m + "분" + s + "초" + ms + "밀리초");
	}

	public static void main(String[] args) {
//	 Abstract class 객체안됨
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);

		Calendar firstDate = Calendar.getInstance();
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);

		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은", firstDate);
	}
}
