package Chap03_Ex;
import java.io.*;
import java.util.Scanner;
public class WhileOper {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int number;
		Scanner  scanner = new Scanner(System.in);
		System.out.print("그릴 삼각형의 높이를 입력하세요! : 	");
		number = scanner.nextInt();
		while(x <= number) {
			while(y<= x) {
				System.out.print("x");
				y = y +1;
			}
			System.out.println();
			x = x + 1;
			y = 1;
		}
	}

}
