package Practice;

public class NumberHolder {
    public int anInt;
    public float aFloat;

    // 생성자를 사용하여 두 개의 멤버 변수 초기화
    NumberHolder(int an, float af) {
        anInt = an;
        aFloat = af;
    }

    // main 메소드 작성
    public static void main(String[] args) {
        // 클래스 인스턴스(객체) 생성
        NumberHolder numberHolder = new NumberHolder(5, 3.14f);

        // 각 멤버 변수의 값 출력
        System.out.println("anInt: " + numberHolder.anInt);
        System.out.println("aFloat: " + numberHolder.aFloat);
    }
}
