package Java_practice.test1;

import java.util.Scanner;

public class practice05_data3 {

	public static void main(String[] args) {

		// 입력받은 문자를 거꾸로 출력
		Scanner k = new Scanner(System.in);
		String str;
		
		System.out.print("문자열을 입력 ==> ");
		str = k.next(); 
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));  //문자열에 속하는 문자는 왼쪽부터 오른쪽까지 0부터 인덱싱되어 있다.
//												charAt은 index로 주어진 값에 해당하는 문자를 리턴한다.
//												인덱스는 0부터 시작하기 때문에 index로 들어갈 수 있는 가장 큰 수는 
//												(문자열.legnth-1)이다.
		}
	}

}
