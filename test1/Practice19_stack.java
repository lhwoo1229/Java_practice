package Java_practice.test1;

import java.util.Scanner;

public class Practice19_stack {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] stack = new char[4];
		int top = 0;
		int select = 2;
		char carName='A';
		
		while(select !=3) {
			System.out.print("<1>자동차 넣기 <2>자동차 빼기 <3>끝 : ");
			select = s.nextInt();
			
			switch(select) {
			
			case 1:
				if(top >= 4) {
					System.out.println("주차장이 꽉 찼습니다.");
				}else {
					stack[top] = carName++;
					System.out.println(stack[top]+"자동차가 주차했습니다.");
					top++;
				}
				break;
				
			case 2:
				if(top<=0 ) {
					System.out.println("빠져나갈 자동차가 없음");
				}else {
					
					System.out.println(stack[0]+"자동차가 나갑니다");
					for()
				}
				break;
				
			case 3:
				System.out.printf("현재 주차장에 %d대가 있음.\n",top );
				System.out.println("프로그램을 종료합니다.");
				break;
			
			
			default:
				System.out.println("잘못 입력했습니다. 다시 해주세요");
		}
	
	}

}
}
