package Java_practice.test1;

import java.util.Scanner;

public class Practice19_stack {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		char[] queue = new char[4];	//주차장과 top의 초기값을 선언, 주차장은 4곳이고 비어있음
		int top = 0;
		char carName='A';	//A부터 시작
		int select = 0;		//입력할 숫자를 담을 곳(아무 숫자(정수)든 상관없음)
		
		while(select !=3) {	//3을 고르지 않는 이상 계속 반복
			System.out.print("<1>자동차 넣기 <2>자동차 빼기 <3>끝 : ");
			select = s.nextInt();	
			
			switch(select) {
			
			case 1:	
				if(top >= 4) {	//4대 넣었을 때
					System.out.println("주차장이 꽉 찼습니다.");
				}else {//빈 곳이 있으면 차를 넣고 top를 1 증가시킨다
					queue[top] = carName++;
					System.out.println(queue[top]+"자동차가 주차했습니다.");
					top++;
				}
				break;
				
			case 2:
				if(top<=0 ) { 
					System.out.println("빠져나갈 자동차가 없음");
				}else {
					// 중요!! 
					//빠져나갈 차가 있으면 배열의[0]번째 부터 나가고
					System.out.println(queue[0]+"자동차가 나갑니다");
					//자동차를 한 칸씩 앞으로 이동 시킨다(top--)
					for(int i=0; i<3; i++)
						queue[i] = queue[i+1];	
					top--;
				}
				break;
				
			case 3:
				System.out.printf("현재 주차장에 %d대가 있음.\n",top );
				System.out.println("프로그램을 종료합니다.");
				break;
			
			
			default:	//1,2,3 외의 값을 입력했을 때
				System.out.println("잘못 입력했습니다. 다시 해주세요");
		}
	
	}

}
}
