package Chap03_Ex;
import java.util.*;
public class Dowhile2Oper {

	public static void main(String[] args) {
		int innum;
		int outnum;
		int count;
		int sum = 0; // 숫자 함 누적
		Scanner scanner = new Scanner(System.in);
		System.out.print("합을 구하는 시작숫자 입력 :");
		innum = scanner.nextInt();
		System.out.print("합을 구하는 끝 숫자 입력 : ");
		outnum = scanner.nextInt();
		count = innum; 				// 합을 구할 시작 숫자 치환
		sum = count;
		do {
			count ++;
			sum += count;			// 합의 값 누적
		}while(count < outnum);
		System.out.println(innum + "부터" + outnum + "까지의 합 : " + sum);
	}

}
