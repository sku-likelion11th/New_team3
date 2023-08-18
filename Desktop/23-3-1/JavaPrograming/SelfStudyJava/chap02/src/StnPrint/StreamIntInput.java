package StnPrint;

import java.io.*;

public class StreamIntInput {
	public static void main(String[] args) throws Exception{
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년도를 입력하세요 :");
		number = Integer.parseInt(inbr.readLine()); // 문자열을 정수로 변환
		System.out.println("입력한 년도는" + number + "년입니다.");202	
		
	}

}
