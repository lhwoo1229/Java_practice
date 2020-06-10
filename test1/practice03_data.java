package Java_practice.test1;

import java.util.Scanner;

public class Practice03_data {

	public static void main(String[] args) {

		int a;
		int b;
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("<1>10 <2>16 <3>8 : ");
		a = key.nextInt();
		System.out.print("값 입력: ");
		b = key.nextInt();
		
		if(a==1) {
			System.out.printf("10진수 ==> %d \n" , b);
		}else if(a==2) {
			System.out.printf("16진수 ==> %X \n" , b);
		}else if(a==3) {
			System.out.printf("8진수  ==> %o \n" , b);
		}
		
//		//%d=10진수, %X=16진수 %o=8진수
//		System.out.print("정수를 입력하세요 => "); 
//		data = key.nextInt();
//		System.out.printf("10진수 ==> %d \n" , data);
//		System.out.printf("16진수 ==> %X \n" , data);
//		System.out.printf("8진수  ==> %o \n" , data);
		
		
	}

}
