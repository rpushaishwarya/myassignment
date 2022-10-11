package week1.day2;

public class Calculator {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multi(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println(c);
	}
public static void main(String[] args) {
	Calculator cal=new Calculator();
	cal.add(10, 10);
	cal.sub(30, 10);
	cal.multi(10, 60);
	cal.div(90, 10);

	
}


}
