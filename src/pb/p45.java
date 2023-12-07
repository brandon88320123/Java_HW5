package pb;

public class p45 {

	public static void main(String[] args) {
		car car1 = new car("一號車");
		car1.start();
		car car2 = new car("二號車");
		car2.start();
		
		for(int i =0;i<5;i++) {
			System.out.println("正在進行main的處理工作");
			
		}

	}

}
