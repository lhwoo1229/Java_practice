package Java_practice.test1;

import java.util.Scanner;

public class Practice15_while {

	public static void main(String[] args) {

		String str; // 입력받을 문자
		char ch;
		int l = 0, s = 0, n = 0; // 대문자, 소문자, 숫자를 0으로 초기화

		Scanner k = new Scanner(System.in);

		System.out.print("문자열을 입력 : ");
		str = k.nextLine();

		int i = 0;
		do {
			ch = str.charAt(i); // 입력한 문자열(str)을 ch에 하나씩 담고,
								// i의 0번째부터 33행의 while문의 반복으로 ch 체크

			if (ch >= 'A' && ch <= 'Z') // A~Z 중 하나라도 걸리면 1씩 증가
				l++;

			if (ch >= 'a' && ch <= 'z') // a~z 중 하나라도 걸리면 1씩 증가
				s++;

			if (ch >= '0' && ch <= '9') // 0~9 중 하나라도 걸리면 1씩 증가
				n++;

			i++;
		} while (i < str.length()); // 입력한 문자열의 끝까지 반복한다.

		System.out.printf("대문자 %d개, 소문자 %d개, 숫자%d개", l, s, n);

	}

}
