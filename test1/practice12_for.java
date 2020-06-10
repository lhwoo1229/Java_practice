package Java_practice.test1;



public class Practice12_for {

	public static void main(String[] args) { 

		int a, b;
		
		/*for(a=2; a<=9; a++) 
			System.out.print("#제"+a+"단# "); //맨 윗줄에 몇 단인지 출력
			
			System.out.printf("\n");
			
			
			  for(a=1; a<=9; a++) { // 각 단의 뒷자리
				for(b=2; b<=9; b++) { // 2~9단 반복  
					System.out.printf("%2dX%d=%2d", b,a,b*a);
				}
				System.out.printf("\n");
			}
		}		// 뒷자리부터 반복하는 이유가
				// 단의 뒷자리부터 반복하고 중첩 if문으로 2~9단을 넣어야
*/				// 1~9단의 1곱셈을 다 반복 후에 2곱셈으로 넘어간다
				// 그러므로 가로로 출력함
	//-------------------------------------------------------------
		
			for(a=9; a>=2; a--) 
				System.out.print("#제"+a+"단# "); 
			
				System.out.printf("\n");
		
			for(a=9; a>=1; a--) { 
				for(b=9; b>=2; b--) {   
					System.out.printf("%2dX%d=%2d", b,a,b*a);
				}
				System.out.printf("\n");
			}
		}		
				// 9단부터 거꾸로 출력
		
}
