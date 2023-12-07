package pb;

public class p47 {

	public static void main(String[] args) {
		car car1 = new car("一號車");
		car1.start();
		
		for(int i = 0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在進行main的處理工作");
			}
			catch(InterruptedException e) {
				
			}

		}

	}
}
