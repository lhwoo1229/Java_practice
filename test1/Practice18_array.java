package Java_practice.test1;

public class Practice18_array {

	public static void main(String[] args) {

		int[][][] array = new int[10][10][10];
		int index = 1;
		int hap = 0;
		
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int c=0; c<10; c++) {
					array[a][b][c] = index++;
				}
			}
		}
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int c=0; c<10; c++) {
					hap += array[a][b][c];
				}
			}
		}
		
		System.out.println("1~1000 까지 합계: " + hap );
	}

}
