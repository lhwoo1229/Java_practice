package Java_practice.test1;

public class Practice18_array {

	public static void main(String[] args) {

		int[][][] array = new int[10][10][10]; //3차원 배열 선언
		int index = 1;	//1부터1000까지 증가할 index
		int hap = 0;	// 합계를 누적할 hap 변수선언
		
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {	//3차원 배열 array에 1부터 1000까지(10x10x10)의 데이터를 채운다.
				for(int c=0; c<10; c++) {	//각각 1부터 10까지
					array[a][b][c] = index++;
				}
			}
		}
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {	//array의 값을 모두 더한다.
				for(int c=0; c<10; c++) {
					hap += array[a][b][c];
				}
			}
		}
		
		System.out.println("1~1000 까지 합계: " + hap );
	}

}
