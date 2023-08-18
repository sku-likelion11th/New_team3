package Practice;

public class Circle2 extends Point {
    int radius;

    Circle2() {
        x = 5;
        y = 5;
        radius = 5;
    }

    Circle2(int a, int b, int c) {
        x = a;
        y = b;
        radius = c;
    }

    public int getRadius() {
        return radius;
    }

    private void setRadius(int r) {
        radius = r;
    }

    public String showCircle() {
        return "Center = " + "(" + x + "," + y + ")" + ", Radius = " + radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String args[]) {
        Circle2 MyCircle = new Circle2();
        MyCircle.setPoint(10, 20);
        MyCircle.setRadius(30);
        System.out.println("The x of MyCircle is " + MyCircle.getX() + ".");
        System.out.println("The y of MyCircle is " + MyCircle.getY() + ".");
        System.out.println("The radius of MyCircle is " + MyCircle.getRadius() + ".");
        System.out.println("MyCircle : " + MyCircle.showCircle() + ".");
        System.out.println("원의 넓이 : " + MyCircle.area());
    }
}

