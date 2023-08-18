package Practice;

public class Exe0403 {
    public static void main(String[] args) {
        String str = "Java Programming Very Good";
        String str2 = "Java Programming";
        int comp;
        System.out.println("[compareTo() 메소드로 문자열 비교]");
        comp = str.compareTo(str2);
        System.out.println("비교 결과 : " + comp);
    }
}

