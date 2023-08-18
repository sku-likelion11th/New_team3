package Chap03_Ex;
import java.util.*;

public class Tranning03_4 {

	public static void main(String[] args) {
		int r[]  = new int[10];	// 10개의 공간을 가진 배열 선언 
		int number;
		int sum = 0;
		int avg = 0;		// 임시 저장 변수 선언&초기화
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 10개를 입력하세요! : ");	
		for(int x=0; x<r.length; x++) {
			r[x] = scan.nextInt();
		}
		System.out.print("입력 데이터 값 : ");		// 배열에 입력된 데이터 출력
		for(int x = 0; x<r.length;x++) {
			System.out.print(r[x] + "..");
		}
		System.out.print("\n오름차순 데이터 값 : ");		
		for(int x =0; x < r.length; x++) {
			for(int y=x+1; y<r.length; y++) {
				if(r[x] > r[y]) {
					number = r[x];
					r[x] = r[y];
					r[y] = number;		// 배열에 있는 값을 오름차순으로 정렬
				}
			}
			System.out.print(r[x]+"..");
		}
		for(int x =0; x<r.length; x++) {
			sum = sum + r[x];
		}
		System.out.print("\n합계 : " + sum);	// 배열에 있는 데이터 값 합계
		avg = sum  / r.length;
		System.out.print("\n평균 : " + avg);		// 배열에 있는 데이터 값 평균
	}
}
