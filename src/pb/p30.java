package pb;

public class p30 {

	public static void main(String[] args) {
		car30 car1 = new car30();
		
		try {
			car1.setcar(1234,-10.0);
		}
		catch(CarException e) {
			System.out.println("�ߥX"+e+"�F");
		}
		car1.show();

	}

}
class CarException extends Exception{
	
}

class car30{
	private int num;
	private double gas;
	
	public car30() {
		num = 0;
		gas = 0.0;
		System.out.println("�w�Ͳ��F�T��");
	}
	public void setcar(int n,double g) throws CarException{
		if(g<0) {
			CarException e = new CarException();
			throw e;
		}else {
			num = n;
			gas = g;
			System.out.println("�N�����]��"+ num + "�A�T�o�q�]��" + gas);
		}
	}
	public void show() {
		System.out.println("�����O:"+ num);
		System.out.println("�T�o�q�O:"+ num);
	}
	
	
}
