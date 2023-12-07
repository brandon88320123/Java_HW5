package pb;

public class p55 {

	public static void main(String[] args) {
		company55 cmp = new company55();
		driver55 dv1 = new driver55(cmp);
		dv1.start();
		driver55 dv2 = new driver55(cmp);
		dv2.start();
		

	}

}
class company55{
	private int sum = 0;
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("目前合計金額是"+tmp+"元");
		System.out.println("賺到"+a+"元了");
		tmp += a;
		System.out.println("合計金額是"+tmp+"元");
		sum = tmp;
	}
}
class driver55 extends Thread{
	private company55 comp;
	public driver55(company55 c) {
		comp = c;
	}
	public void run(){
		for(int i = 0;i<3;i++) {
			comp.add(50);
		}
	}
}