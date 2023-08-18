package Chap05_Ex;

import java.util.Scanner;

abstract class Calc {
    int a, b;
    void setValue(int x, int y) {
        a = x;
        b = y;
    }
    abstract int calculate();
}

class Add extends Calc {
    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    int calculate() {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String operator = scanner.next();
        scanner.close();

        Calc calc;

        if (operator.equals("+")) {
            calc = new Add();
        } else if (operator.equals("-")) {
            calc = new Sub();
        } else if (operator.equals("*")) {
            calc = new Mul();
        } else if (operator.equals("/")) {
            calc = new Div();
        } else {
            System.out.println("잘못된 연산자입니다.");
            return;
        }

        calc.setValue(num1, num2);
        System.out.println("결과: " + calc.calculate());
    }
}