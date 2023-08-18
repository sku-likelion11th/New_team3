package Chap03_Ex;
import java.util.*;
public class DoWhileOper {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("그릴 삼각형 높이를 입력하세요! :");
		number = scanner.nextInt();
		
		if(number > 0) {
		do {
			do {
				System.out.print("x");
				y = y +1;
				}while(y <= x);
			
			System.out.println();
			x = x + 1;
			y = 1;
			}while(x <= number);
		}else {
			System.out.print("오류");
	}
	}
	}
