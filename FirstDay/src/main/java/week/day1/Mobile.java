package week.day1;

public class Mobile {
	String mobileBrandName="vivo y75";
	char mobileLogo='v';
	short noOfMobilePiece=24;
	int modelNumber=9876510;
	long mobileImeiNumber=1912344567L;
	float mobilePrice=2400.00F;
	boolean isDamaged=false;
public static void main(String[] args) {
	Mobile phone=new Mobile();
	System.out.println(phone.mobileBrandName);	
	System.out.println(phone.mobileLogo);
	System.out.println(phone.noOfMobilePiece);
	System.out.println(phone.modelNumber);
	System.out.println(phone.mobileImeiNumber);
	System.out.println(phone.mobilePrice);
	System.out.println(phone.isDamaged);

	
}



}
