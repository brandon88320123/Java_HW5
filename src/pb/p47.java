package pb;

public class p47 {

	public static void main(String[] args) {
		car car1 = new car("�@����");
		car1.start();
		
		for(int i = 0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("���b�i��main���B�z�u�@");
			}
			catch(InterruptedException e) {
				
			}

		}

	}
}
