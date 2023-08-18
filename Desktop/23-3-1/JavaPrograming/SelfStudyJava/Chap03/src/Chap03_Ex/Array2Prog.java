package Chap03_Ex;

public class Array2Prog {

	public static void main(String[] args) {
		int[][] arycount = {{10,20,30},{40,50,60}};
		int [][] subject = new int[2][3];
		int asum=0;		int bsum =0;
		// subject 배열에 값 입력
		for(int x =0; x < subject.length; x++) {
			for(int y=0; y<subject[x].length; y++) {
				subject[x][y] = x+y;
			}
		}
		// 배열 값 합해서 출력
		for(int x = 0; x < arycount.length; x++) {
			for(int y = 0; y <arycount[x].length; y++) {
			asum = asum + arycount[x][y];
			bsum = bsum + subject[x][y];
			}
		}
		System.out.println("2차원 배열 arycount의 행수 : " + arycount.length);
		System.out.println("2차원 배열 arycount의 열수 : " + arycount[0].length);
		System.out.println("2차원 배열 arycount의 합 : " + asum);
		System.out.println("2차원 배열 subject의 합 : " + bsum);
	}
}
