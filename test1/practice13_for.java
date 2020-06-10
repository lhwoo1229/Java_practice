package Java_practice.test1;

import java.util.Scanner;

public class practice13_for {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in); 
		String str;  //입력받을 문자열 변수
		int a;			// 입력한 문자의 개수를 저장할 변수
		int i;
		
		System.out.print("문자를 입력: ");
		str=k.nextLine();			// 입력된 문자를 str에 담는다
		
		System.out.println("입력된 문자열: " + str);
		System.out.print("변환된 문자열: "); //줄바꿈을 없애서 옆으로 반복문이 출력되게 함
		
		a= str.length(); //a에 입력된 문자 제일 끝자리를 계산
		
		for(i=a-1; i>=0; i--) { //인덱스가 0부터 시작하기 때문에 -1을 해줘야 한다
			System.out.print(str.charAt(i)); 
				//charAt(i) 문자열 중 i한 글자씩 가져와서 반복 (꼭 외우기!)
		}
		
		
		
		
	}	
}
