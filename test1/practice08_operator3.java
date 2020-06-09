package Java_practice.test1;

import java.util.Scanner;

public class practice08_operator3 {

	public static void main(String[] args) {

		int year;
		Scanner k = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요: " );
		year=k.nextInt();
		
		// 조건식마다 묶고 and연산자끼리 묶어야한다 (괄호주의) , 100으로 나누어 떨어지면 안되지만 400은 가능하기에 or
		if(((year%4==0) && (year%100!=0)) || (year%400==0)) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년입니다.");
		}
	}

}
