package StnPrint;
import java.util.*;		// Scanner 사용
public class Traing05 {
	public static void main(String[] args) {
		int r;
		double Pai = 3.14159;
		double circler;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 정수로 입력하시오. : ");
		r = scanner.nextInt();
		// circler = 2 * Pai * r;
		circler = 2 * Pai * r;
		System.out.print("원의 반지름 : " + r);
		System.out.print("\n원의 둘레 : " + circler);
	}
}
