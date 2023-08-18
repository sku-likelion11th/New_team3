package Chap03_Ex;
import java.io.*;

public class SwithOper {

	public static void main(String[] args)throws Exception {
	int score;
	BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("당신의 점수를 입력하세요! : ");
	score = Integer.parseInt(inbr.readLine());
	int h = score/10;
	switch(h) {
		case 10:
		case 9:
			System.out.print("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.print("당신의 학점은 B입니다.");
			break;
		case 7:
		case 6:
			System.out.print("당신의 학점은 C입니다.");
			break;
		case 5:
		case 4:
			System.out.print("당신의 학점은 D입니다.");
			break;
		default:
			System.out.print("당신의 학점은 F입니다.");
		}
	}
}
