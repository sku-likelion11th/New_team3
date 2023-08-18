package StnPrint;
import java.util.*;
public class Practice02_4 {
	
	public static void main(String[] args) {
		int price;	int sale; 	int saleprice;	// 변수 선언(정수 3개)
		Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성
		System.out.print("상품 가격을 입력하세요 : ");  // 키보드 입력 메시지(상품 가격)
		price = scanner.nextInt();  // 키보드로 입력한 자료를 정수로 읽어서 변수에저장
		System.out.print("할인률을 입력하세요(%) : ");  // 키보드 입력 메시지 (할인률)
		sale = scanner.nextInt();  // 키보드로 입력한 자료를 정수로 읽어서 변수에 저장
		saleprice = price - (price * sale) /100;  // 세일 가격 계산(정수 출력으로)
		System.out.print("상품 가격 : " + price);
		System.out.print("\n할인률\t: " + sale);
		System.out.print("\n세일가격 : " + saleprice);  // 결과를 모니터에 출력(상품가격, 할인률, 세일가격) 
	}
}
