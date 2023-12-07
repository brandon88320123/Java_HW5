package pb;

public class p52 {

	public static void main(String[] args) {
		company cmp = new company();
		driver dv1 = new driver(cmp);
		dv1.start();
		driver dv2 = new driver(cmp);
		dv2.start();
		

	}

}
class company{
	private int sum = 0;
	public void add(int a) {
		int tmp = sum;
		System.out.println("目前合計金額是"+tmp+"元");
		System.out.println("賺到"+a+"元了");
		tmp += a;
		System.out.println("合計金額是"+tmp+"元");
		sum = tmp;
	}
}
class driver extends Thread{
	private company comp;
	public driver(company c) {
		comp = c;
	}
	public void run(){
		for(int i = 0;i<3;i++) {
			comp.add(50);
		}
	}
}