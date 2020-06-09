package Java_practice.test1;

import java.util.Scanner;

public class practice11_if_switch {

	public static void main(String[] args) {

		int a,b;
		int result; 
		char ch;
		String[] str; //문자역 배열을 준비, 입력된 수식을 str[0], str[1],str[2]에 분리해서 넣는다.
		
		Scanner k =new Scanner(System.in);
		
		System.out.print("수식을 한줄로 띄어쓰기로 입력하세요: ");
		str= k.nextLine().split(" "); //nextLine()은 문자열을 한 줄로 입력받는다.
									  //split(" ")은 입력받은 문자열을 공백으로 분리한다.
		
		a = Integer.parseInt(str[0]); //첫 번째 숫자에 해당하는 문자열(str[0])을 정수로 *변환*해서 a에 저장
		ch = str[1].charAt(0);	// str[1]에 해당하는 수식 첫번째 글(charAt(0))을 저장
		b = Integer.parseInt(str[2]);
		
		switch(ch) { // 정수 값에 수식인 ch를 입력
			case '+' : //char 값인 ch를 ''안에 넣는다
				System.out.printf("%d + %d = %d \n",a,b,a+b );
				break;
			case '-' :
				System.out.printf("%d - %d = %d \n",a,b,a-b );
				break;
			case '*' :
				System.out.printf("%d * %d = %d \n",a,b,a*b );
				break;
			case '/' :
				System.out.printf("%d / %d = %d \n",a,b,a/b );
				break;
			case '%' :
				System.out.printf("%d %% %d = %d \n",a,b,a%b );
				break;
			default:
				System.out.println("연산자를 잘못 입력했습니다.");
		}
		
		
		
	}

}
