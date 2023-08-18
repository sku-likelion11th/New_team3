package Chap03_Ex;

public class ArrayProg {

	public static void main(String[] args) {
		int[]	x;
		int sum = 0;
		x = new int[5]; 			// int[] x = new int[5];
		
		for( int i = 0; i < 5; i++) {
			x[i] = i * 10;
		}
		for (int j = 0; j < 5; j++) {
			sum += x[j];
		}
		System.out.println("배열 5개의 합 : "+ sum);
	}

}
