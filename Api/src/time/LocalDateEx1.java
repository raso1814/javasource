package time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LocalDateEx1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		System.out.println(sdf.format(date));
		
		LocalDate currDate = LocalDate.now();
		//now�� static method�̹Ƿ� ��ü���� �ʿ����
		System.out.println(currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		
		
		
		

	}

}
