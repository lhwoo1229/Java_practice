package Java_practice.test1;


import java.util.Scanner;



public class Practice01_calcul {

	public static void main(String[] args) {

		int a,b,c,d;
		int Result; 
		
		Scanner key = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		a = key.nextInt();
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		b = key.nextInt();
		System.out.print("세번째 계산할 값을 입력하세요 ==>");
		c = key.nextInt();
		System.out.print("네번째 계산할 값을 입력하세요 ==>");
		d = key.nextInt();
		
		
		Result = a+b+c+d;
		System.out.println(a+"+"+b+"+"+c+"+"+d+" = "+ Result);
	}

}
