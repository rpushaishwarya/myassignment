package Mobile;

public class MyMobile {
	public void sendMessage() {
		System.out.println("sending message");
	}
	public void shareDocument() {
		System.out.println("sharing doc");
	}
	public void call() {
		System.out.println("calling");
	}
public static void main(String[] args) {
	MyMobile mob=new MyMobile();
	mob.call();
	mob.sendMessage();
	mob.shareDocument();
	
}


}
