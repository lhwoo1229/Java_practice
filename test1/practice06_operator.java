package Java_practice.test1;

import java.util.Scanner;

public class Practice06_operator {

	public static void main(String[] args) {

		double a, b;
		double result;
		Scanner k = new Scanner(System.in);
		
		System.out.print("첫번째 계산할 값을 입력하세요==> ");
		a=k.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요==> ");
		b=k.nextInt();
		
		result = a+b;
		System.out.println(a+"+"+b+"= "+result );
		result = a-b;
		System.out.println(a+"-"+b+"= "+result );
		result = a*b;
		System.out.println(a+"*"+b+"= "+result );
		result = a/b;
		System.out.println(a+"/"+b+"= "+result );
		result = a%b;
		System.out.println(a+"%"+b+"= "+result );
		
		
	}

}
