package bult_in.time;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		// 1.8 이전에서는 new Date()를 통해 구현했던 것을
		// 1.8 이후에서는 Calender 혹은 LocalDate, LocalDateTime 을 사용을 권정한다
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.plusYears(1L));
		LocalDate ago100 = today.minusYears(100L);
		System.out.println(ago100);
		//month, Week, Year 전부 가능
	}

}
