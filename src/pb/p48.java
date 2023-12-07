package pb;

public class p48 {

	public static void main(String[] args) {
		car car1 = new car("一號車");
		car1.start();
		
		try {
			car1.join();
				
		}
		catch(InterruptedException e) {
				
		}
		System.out.println("結束main的處理工作");
		}
}
