package Chap04_ex;

public class VarargsEx {
	String name;	 String age;
	VarargsEx(String ... person) { 
		name = person[0];
		age = person[1]; }
public void personPrint(String ... names ) { 
	for(String name : names) { 
		System.out.print(name + "\t");
	}
	System.out.println();
}
public static void main(String[] args) {
	System.out.println("*가변인자 생성자 호출*");
	VarargsEx va = new VarargsEx("Tom", "25"); 
	System.out.println(va.name + "\t" + va.age + "\n");
	System.out.println("*가변인자 메소드 호출*");
	va.personPrint("jkCho"); 
	va.personPrint("liShin", "jsLee", "ysKim"); 
} 
}