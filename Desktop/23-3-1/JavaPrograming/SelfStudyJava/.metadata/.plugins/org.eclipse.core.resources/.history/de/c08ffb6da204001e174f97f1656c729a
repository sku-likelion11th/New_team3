package Practice;

public abstract class Shape {
    protected int x, y, width, height;

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public abstract float getArea();
}

class Rectangle extends Shape {
    public float getArea() {
        return height * width;
    }
}

class Triangle extends Shape {
    public float getArea() {
        return (height * width) / 2.0f;
    }
}

class ShapeTest {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        r.setWidth(5);
        r.setHeight(10);
        System.out.println("사각형 넓이 : " + r.getArea());
        t.setWidth(5);
        t.setHeight(10);
        System.out.println("삼각형 넓이 : " + t.getArea());
    }
}
