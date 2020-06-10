package Java_practice.test1;

import java.util.Scanner;

public class practice10_if_switch {

	public static void main(String[] args) {

		int a,b;
		int result; 
		char ch; 
		Scanner k =new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요: ");
		a=k.nextInt();
		
		System.out.print("계산할 연산자를 입력하세요: ");
		ch=k.next().charAt(0); // s.next()는 문자열을 입력받고, charAT(0)은 그중 첫번째(0)글자를 가져옴
		
		System.out.print("두번째 수를 입력하세요: ");
		b=k.nextInt();
		
		if(ch == '+') { // 중복 if문을 활용한 간단한 계산기
		System.out.println(a+"+"+b+" = "+ (a+b) +"입니다." );
		}
		else if(ch=='-') {
			System.out.printf("%d - %d = %d 입니다. \n", a,b,a-b);
		}
		else if(ch=='*') {
			System.out.printf("%d * %d = %d 입니다. \n", a,b,a*b);
		}
		else if(ch=='/') {
			System.out.printf("%d / %d = %d 입니다. \n", a,b,a/b);
		}
		else if(ch=='%') {	//논리연산자%는 %%
			System.out.printf("%d %% %d = %d 입니다. \n", a,b,a%b);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}
