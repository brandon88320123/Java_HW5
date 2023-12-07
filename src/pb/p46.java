package pb;

public class p46 {

	public static void main(String[] args) {
		car46 car1 = new car46("一號車");
		car1.start();

		for(int i =0;i<5;i++) {
			System.out.println("正在進行main的處理工作");
			
		}

	}

}
class car46 extends Thread{
	private String name;
	public car46(String nm) {
		name = nm;
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			try {
				sleep(1000);
				System.out.println("正在進行"+name+"的處理工作");
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}