package ex16usefulclass;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;

public class E05DateCalendar1 {
	
	public static Date date;
	/*
	 Calendar클래스를 통해 얻은 객체로 현재시간을 초로 반환받은 후
	 날짜를 원하는 포맷의 문자열로 반환한다.
	 */
	public static String myDateFormat(Calendar c, String formatStr) {
		Date date = c.getTime(); //1970년 1월 1일부터 지금까지의 시간을 초로 반환.
		return new SimpleDateFormat(formatStr). format(date);
	}
	/*
	 특정날짜를 지정하여 반환하는 메서드.
	 여러개의 값을 반환하고 싶을 때는 배열을 이용할 수 있다.
	*/
	public static String[] myDiffDate() throws ParseException{
		//우리가 사용하는 날짜의 포맷 형식
		String today = "2021/10/11";
		String future = "2021/12/25";
		
		//날짜의 포맷을 이용해서 우리가 사용하는 날짜를 Date객체로 변환한다.
		Date formatToday = new SimpleDateFormat("yyyy/MM/dd").parse(today);
		Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
		/*getTime으로 얻어오는 시간을 총 13자리 정수값인데
		1~10까지는 순수한 초이고, 11~13자리까지는 밀리세컨즈를 의미한다.
		즉 1000으로 나눠서 뒤의 3자리를 봐야할 것.
		*/
		long diffSec = (formatFuture.getTime() - formatToday.getTime()) / 1000;
		long diffMin = (formatFuture.getTime() - formatToday.getTime()) / 6000;
		long diffHor = (formatFuture.getTime() - formatToday.getTime()) / 3600000;
		long diffDays = diffSec / (24*40*60);
		
		String[] strArr = new String[4];
		strArr[0] = diffSec + "초 남음";
		strArr[1] = diffMin + "분 남음";
		strArr[2] = diffHor + "시 남음";
		strArr[3] = diffDays + "일 남음";
		
		return strArr;
	}

	public static void main(String[] args) throws ParseException {
		
		//Calender클래스는 대표적인 싱글톤이므로 new로 생성하지 않는다.
		Calendar calendar = Calendar.getInstance();
		
		//여러가지 서식문자 활용하기
		System.out.println("오늘날짜: "+ myDateFormat(calendar, "yyyy-MM-dd"));
		System.out.println("현재시간: "+ myDateFormat(calendar, "HH:mm:ss"));
		System.out.println("오늘날짜: "+ myDateFormat(calendar, 
				"오늘은 yyyy년의 w주차, D번째날"));
		System.out.println("오늘날짜: "+ myDateFormat(calendar, 
				"오늘은 M월의 W번째 주, d번째 날, F번째 E요일"));
		
		//myDateFormat()을 호출하면 아래코드의 중복을 제거할 수 있다.
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.DATE, 1);
		date = calendar2.getTime();
		String dateStr5 = new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println("내일날짜: " + dateStr5);
		
		//월을 정의한 산수: 1을 더해야 정상적인 월이 된다.
		System.out.println("1월: " + (Calendar.JANUARY +1));
		System.out.println("12월: " + (Calendar.DECEMBER +1));
		
		String[] returnArr = myDiffDate();
		System.out.println("올해 크리스마스까지...");
		
		for(String s: returnArr) {
			System.out.println(s);
		}
	}

}
