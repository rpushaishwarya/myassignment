package week.day1;

public class ToWeeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=24;
	boolean isPunctured=false;
	String bikeName="RoyelEnfield";
	double runningKM=45.5;
public static void main(String[] args) {
	ToWeeler bike=new ToWeeler();
	System.out.println(bike.noOfWheels);
	System.out.println(bike.noOfMirrors);
	System.out.println(bike.chassisNumber);
	System.out.println(bike.isPunctured);
	System.out.println(bike.bikeName);
	System.out.println(bike.runningKM);
}

}
