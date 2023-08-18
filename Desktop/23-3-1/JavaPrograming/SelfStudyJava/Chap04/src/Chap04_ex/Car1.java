package Chap04_ex;

public class Car1 {
	String color;						// 자동차 색상을 표시하는 문자열 변수 정의
	String size;						// 자동차 크기를 표시하는 문자열 변수 정의
	boolean engineState;			// 엔진 상태를 표시하는 논리 변수 정의
	
	void showAtts() {				// 속성을 알려주는 method 정의
		System.out.println("This car is a " + color + " " + size + ".");
		if(engineState == true) {
			System.out.println("The engine is on.");
		}else {								// engineState가 false일 경우 출력
			System.out.println("The engine is off.");
		}
	}
	void startEngine() {			// 시동 거는 method 정의
		if (engineState == true) {
			System.out.println("The engine is already on. \n");
		} else {
			engineState = true;
			System.out.println("The engine was started. \n");
		}
	}
	void stopEngine() {				// 시동 끄는 method 정의
		if(engineState == false) {
			System.out.println("The engine is already off. \n");
		} else {
			engineState = false;
			System.out.println("The engine was stopped. \n");
		}
	}
public static void main(String[] args) {
	Car1 yourCar = new Car1();
	yourCar.color = "blue";
	yourCar.size = "mid-size";
	yourCar.showAtts();
	yourCar.startEngine();
	yourCar.showAtts();
	yourCar.stopEngine();
}
}
