package Chap03_Ex;
import java.util.*;
public class Tranning03_3 {

	public static void main(String[] args) {
		int[] num = new int[5];		// 5개의 저장 공간을 가진 배열 선언
		int temp = 0;		// 임시 저장 변수
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {			// for를 이용하여 배열 i로 값 할당
			System.out.print((i+1) + "번째 숫자를 입력하세요. : " );
			num[i] = scan.nextInt();
		}
		for(int x=0; x < 5; x++) {		// 배열 값 비교하여  최대값 구함
			if(temp < num[x]) {
				temp = num[x];
			}
		}
		System.out.println("****최대값 구하기****");
		for(int i = 0; i < 5; i ++) {    
			System.out.println((i+1) + "번째 입력 값 : " + num[i]);
		}
		System.out.println("최 	대 	값 : " + temp);
	}
}
