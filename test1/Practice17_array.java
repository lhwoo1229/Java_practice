package Java_practice.test1;


public class Practice17_array {

	public static void main(String[] args) {

		int[][]gg = new int[9][9]; //문자열 2차원 배열 gg와 첨자변수(하나의 변수에 두 개 이상의 데이터를 기억할 수 있는 변수)
		int i, s;					//i,s를 선언
		
		for(i=0; i<9; i++) {// 안쪽 for문부터 반복
			for(s=0; s<9; s++) { //*결과먼저 저장!! 1의배수(i)부터 s를 증가시켜 곱셈
				gg[i][s] = (i+1)*(s+1); //i,s가 0부터 시작하므로 1을 더함
			}
		}
		
		for(i=0; i<9; i++) {  //구구단의 식을 출력!
			for(s=0; s<9; s++) {
				System.out.printf("%dX%d=%2d ",s+1, i+1, gg[i][s]);
			}		//위와는 반대로 s를 먼저 출력해서 구구단이 세로로 출력되게함
			System.out.println("");
		}
	}

}
