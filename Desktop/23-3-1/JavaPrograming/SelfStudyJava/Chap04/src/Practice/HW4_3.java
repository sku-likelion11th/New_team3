package Practice;

public class HW4_3 {
    public static void main(String[] args) {
        String str1 = "Java Programming Very Good";
        String str2 = "java Programming";
        boolean x, y, z;

        System.out.println("[regionMatches() 메소드로 부분 문자열 비교]");

        // 부분 문자열 비교 결과 출력
        x= str1.regionMatches(5, str2, 5, 11);
        System.out.println("부분 문자열의 비교 결과 : " + x);

        // 대소문자 구분하지 않고 부분 문자열의 비교 결과 출력
        y= str1.regionMatches(true, 0, str2, 0, 4);
        System.out.println("대소문자 구분없이 부분문자열의 비교 결과 : " + y);

        // 대소문자 구분하여 부분 문자열의 비교 결과 출력
        z= str1.regionMatches(false, 0, str2, 0, 4);
        System.out.println("대소문자 구분하여 부분문자열의 비교 결과 : " + z);
 }
}

