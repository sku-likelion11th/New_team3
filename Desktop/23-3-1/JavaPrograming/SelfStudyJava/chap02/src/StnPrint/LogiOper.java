package StnPrint;

public class LogiOper {
	public static void main(String[] args) {
		int x = 20; int y = 30; int z = 40;
		boolean a, b, c, d;
		if(x<y && y <z) {
			System.out.println(x + "<" + y + "AND" + y + "< " + z +"= Good");
		}
		if(x<y || y <z) {
			System.out.println(x + "<" + y + "OR" + y + "< " + z +"= Good");
		}
		a = true;
		b = c = false; 				// false는 defalut값이라 초기화 안해도 상관 없음.
		d= a || b && c;
		System.out.println(" a = "+a+", b= "+b+", c= "+c+", d=" +d);
	}
}
