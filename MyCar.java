package week1.day2;

public class MyCar {
	public void applyBreak() {
		System.out.println("car should be stop");
	}
	public void applyGear() {
		System.out.println("gear mode should be change");
		
	}
	public void switchOnAc() {
		System.out.println("Ac should be work");
	}
	public void applyAcclerate() {
		System.out.println("car should be start");
	}
public static void main(String[] args) {
	MyCar car=new MyCar();
	car.applyAcclerate();
	car.applyBreak();
	car.applyGear();
	car.switchOnAc();
}


}
