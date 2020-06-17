package Java_practice.test1;

import java.util.Scanner;

public class Practice16_while {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		String str;
		char ch;
		int i, a;
		int star;
		
		System.out.print("숫자를 여러 개 입력: ");
		str = k.nextLine();
		
		i = 0;	//문자열의 위치를 나타낼 변수 i
		ch = str.charAt(i); //문자열로 담은 숫자를 한 글자(숫자)씩 추출한다(0번째부터)
		while(true) {
			star = (int)ch-48;	//문자를 숫자로 변환(숫자0~9까지 아스키코드값은 48~57이므로 48을 뺀다)
			
			for(a=0; a<star; a++) { // 별의 개수만큼 *을 화면에 출력한다
				System.out.printf("*");
				
			}
			System.out.printf("\n");
			
			if(++i>str.length()-1) //먼저 i를 1증가시킨 후 문자열 길이 -1보다 크면 while문을 종료한다.
				break;
			ch = str.charAt(i); //문자열에서 한 글자(숫자)를 추출한다.
			
		}
	}
}
