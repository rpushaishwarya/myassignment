package week1.day2;

public class bicycle {
	//access 
	public void pediling() {
		System.out.println("cycle running");
	}
	private void wheeling() {
		System.out.println("stunt");
	}
	void cycling() {
		System.out.println("travelling");
	}
public static void main(String[] args) {
	bicycle cyc=new bicycle();
	cyc.pediling();
	cyc.wheeling();
	cyc.cycling();


}

}
