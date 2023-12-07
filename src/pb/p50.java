package pb;

public class p50 {

	public static void main(String[] args) {
		carm car1 = new carm("一號車");
		
		Thread th1 = new Thread(car1);
		th1.start();
		for(int i =0;i<5;i++) {
			System.out.println("正在進行main的處理工作");
			
		}

	}

}
class carm implements Runnable{
	private String name;
	public carm(String nm) {
		name = nm;
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}