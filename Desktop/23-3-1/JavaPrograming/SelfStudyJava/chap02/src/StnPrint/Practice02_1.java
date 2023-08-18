package StnPrint;
import java.io.*;		// import 선언

public class Pratice02_1 {
	public static void main(String[] args)throws IOException {
		String name;
		String number;
		String toplescore;		// 변수 선언(이름, 학번, 토플점수)
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader 클래스 객채 생성
		System.out.print("이름, 학번 , 토플점수를 입력하세요. : ");
		name = inbr.readLine();
		number = inbr.readLine();
		toplescore = inbr.readLine();	// 키보드 입력메시지
		System.out.println("나의 이름은" + name + "입니다.");
		System.out.println("나의 학번은" + number + "입니다");
		System.out.println("그리고 토플점수는" + toplescore + "점 입니다.");		// 키보드에 입력한 자료를 문자열로 읽어서 변수에 저장
	}
}
