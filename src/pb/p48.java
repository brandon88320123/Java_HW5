package pb;

public class p48 {

	public static void main(String[] args) {
		car car1 = new car("�@����");
		car1.start();
		
		try {
			car1.join();
				
		}
		catch(InterruptedException e) {
				
		}
		System.out.println("����main���B�z�u�@");
		}
}
