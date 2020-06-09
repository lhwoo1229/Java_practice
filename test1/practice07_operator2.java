package Java_practice.test1;

import java.util.Scanner;

public class practice07_operator2 {

	public static void main(String[] args) {

		
		int money, b500, c100, d50, e10, n; 
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("## 교환할 돈은? ");
		
		money=k.nextInt();
		
		b500 = money/500;			// 순차적으로 연산 ↓
		money=money%500;			// 나누고 나머지 값을 money에 다시 대입
		
		c100 = money/100;
		money=money%100;
		
		d50 = money/50;
		money=money%50;
		
		e10 = money/10;
		money=money%10;
		
		n = money;
		
		
		
		System.out.println("500원 ==>"+b500+"개");
		System.out.println("100원 ==>"+c100+"개");
		System.out.println("50원 ==>"+d50+"개");
		System.out.println("10원 ==>"+e10+"개");
		System.out.println("바꾸지 못한 잔돈 ==>"+ n);
		
	}

}
