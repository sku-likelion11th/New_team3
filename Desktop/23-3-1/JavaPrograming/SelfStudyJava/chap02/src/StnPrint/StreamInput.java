package StnPrint;

import java.io.*;

public class StreamInput {
	public static void main(String[] args) throws IOException{
		String name;
		BufferedReader inbr = new BufferedReader(new InputStreamR5eader(System.in));
		System.out.print("당신의 이름을 입력하세요:");
		name = inbr.readLine();
		System.out.print("당신의 이름은" + name + "입니다.");
	}
}
