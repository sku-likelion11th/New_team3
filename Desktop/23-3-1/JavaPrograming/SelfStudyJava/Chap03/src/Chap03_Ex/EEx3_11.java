package Chap03_Ex;
import java.util.*;
public class EEx3_11 {

	public static void main(String[] args) {
		int intval;
		int count = 0;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요!  :");
		intval = scanner.nextInt();
		for( int i = 0; i <= intval; i+=5) {
			count +=i;
			total ++;
		}
		System.out.println("정수 입력 값      : " + intval);
		System.out.println("5의 배수의 갯수 :" + (count -1));
		System.out.println("5의 배수의 합    :" + (total));
	}

}
