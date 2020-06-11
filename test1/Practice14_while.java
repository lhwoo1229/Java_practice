package Java_practice.test1;

import java.util.Scanner;

public class Practice14_while {

	public static void main(String[] args) {

		int start, end, c;
		int hap = 0;
		Scanner k = new Scanner(System.in);
		
		System.out.print("합계의 시작값 ==> ");
		start = k.nextInt();
		System.out.print("합계의 끝값 ==> ");
		end = k.nextInt();
		System.out.print("배수 ==>");
		c = k.nextInt();
		
	
		int i = start;
			while(i<=end) { 	//i(시작값)가 end(끝값)보다 작거나 같을 동안 계속 반복한다.
				if(i%c==0) 	//i의 값이 입력한 c(배수)라면 누적해서 더해간다
				hap +=i;
			
			i++;
					
			}	
			
			System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d \n", start,end,c,hap);
	}

}
