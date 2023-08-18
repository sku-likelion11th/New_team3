package StnPrint;

public class BitOper {
	public static void main(String[] args) {
		byte x = 0x30;				//48
		byte y = 0x25;				//37
		System.out.println(x + "AND" + y + "=" + (x&y));
		System.out.println(x + "OR" + y + "=" + (x|y));
		System.out.println(x + "XOR" + y + "=" + (x^y));
		System.out.println("~" + x + "=" + (~x));
		System.out.println(x + "<<2=" + (x<<2));
		System.out.println(y + ">>2" + (y>>2));
		//printf()메소드 사용	
		System.out.printf("%x AND %x = %x\n",x ,y, (x&y));
	}
}
