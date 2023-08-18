package Chap04_ex;

class PassByValueo {
public void increment (int j) { // 인스턴스 메소드
	j++; 
	System.out.println("Value of j in the increment = " + j);
}
public static void main(String[] args) {
	int j = 5; 
	PassByValueo pbv = new PassByValueo();
	System.out.println("Value of j before the call = " + j);
	pbv.increment(j); // 인스턴스 메서드 호출
	System.out.println("Value of j after the call = " + j); 
}
}
