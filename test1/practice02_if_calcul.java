package Java_practice.test1;

import java.util.Scanner;

public class practice02_if_calcul {

	public static void main(String[] args) {

		int a, b;
		int result;
		int s;
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		a = k.nextInt();
		System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈<5>% ==>");
		s = k.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		b = k.nextInt();
		
		
		if(s==1) {
			result = a + b;
			System.out.println(a+"+"+b+"= "+result);
		}else if(s==2) {
			result = a - b;
			System.out.println(a+"-"+b+"= "+result);
		}else if(s==3) {
			result = a * b;
			System.out.println(a+"*"+b+"= "+result);
		}else if(s==4) {
			if(b!=0) {
				result = a / b;
				System.out.println(a+"/"+b+"= "+result);
			}else {//0으로 나누면 뜨는 오류 잡기
				System.out.println("0으로 나누면 안됩니다.");
			}
		}else if(s==5) {
			if(b!=0) {
				result = a % b;
				System.out.println(a+"%"+b+"= "+result);
			}else {
				System.out.println("0으로 나누면 안됩니다.");
			}
		}
	}

}
