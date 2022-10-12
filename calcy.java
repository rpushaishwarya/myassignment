package week1.day2;

public class calcy {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subractionTwoNumber(int e,int f) {
		int c=e-f;
		System.out.println(c);

	}
	public void multipleTwoNumber(double i,double j) {
		double c=i*j;
		System.out.println(c);

	}
	public void divideTwoNumber(float x,float y) {
		float c=x/y;
		System.out.println(c);

	}
public static void main(String[] args) {
	calcy cal=new calcy();
	cal.additionTwoNumber(10, 20);
	cal.subractionTwoNumber(50,5);
	cal.multipleTwoNumber(50, 50);
	cal.divideTwoNumber(10, 2);
}


}
