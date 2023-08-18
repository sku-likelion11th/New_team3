package StnPrint;
import java.util.*;		// import 선언

public class Practice02_2 {

	public static void main(String[] args) {
		int a, b;		// 변수 선언
		Scanner scanner = new Scanner(System.in);		// Scanner 객체 생성
		System.out.print("두개의 정수를 입력하시오 : "); // 키보드 입력 메세지
		a = scanner.nextInt();
		b = scanner.nextInt(); // 키보드로 입력한 2개의 자려를 정수로 읽어서 변수에 저장
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
	}
}
