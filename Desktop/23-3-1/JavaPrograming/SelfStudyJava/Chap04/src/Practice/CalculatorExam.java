package Practice;
public class CalculatorExam {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // 정사각형 넓이 구하기 메소드 호출
        double squareArea = calc.areaRectangle(20);
        
        // 직사각형 넓이 구하기 메소드 호출
        double rectangleArea = calc.areaRectangle(20, 30);
        
        // 정사각형, 직사각형 결과 출력
        System.out.println("정사각형의 넓이 = " + squareArea);
        System.out.println("직사각형의 넓이 = " + rectangleArea);
    }
}

class Calculator {
    // 정사각형 넓이
    double areaRectangle(double side) {
        return side * side;
    }

    // 직사각형 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
