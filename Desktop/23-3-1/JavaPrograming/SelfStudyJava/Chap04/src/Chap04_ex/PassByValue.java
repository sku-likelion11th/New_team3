package Chap04_ex;

class PassByValue {
public static void increment (int j) {
	j++;
	System.out.println("Value of j in the increment = " + j);
}
public static void main(String[] args) {
	int j=5; 
	System.out.println("Value of j before the call = " + j);
	increment(j); 
	System.out.println("Value of j after the call = " + j); 
}
} 