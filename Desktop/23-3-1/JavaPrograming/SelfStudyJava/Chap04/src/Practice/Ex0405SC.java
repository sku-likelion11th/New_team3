package Practice;
import java.util.*; //Scanner 사용

public class Ex0405SC {
    public static void main(String[] args) {
        System.out.print("출력할 문자열을 입력하세요! : ");
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        
        //StringBuffer형 변수 생성
        StringBuffer str = new StringBuffer(instr);
        System.out.println("입력한 문자열 : " + str);
        
        //문자열을 거꾸로 바꾼다.
        str.reverse(); // 문자열 뒤집기 위해 reverse 메서드 사용
        System.out.println("거꾸로 바뀐 문자열 : " + str);
    }
}

