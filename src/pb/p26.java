package pb;

public class p26 {

	public static void main(String[] args) {
		try {
			int[] test = new int [5];
			System.out.println("將直指定給test[10]");
			test[10] = 80;
			System.out.println("將80指定給test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列的索引範圍了");
			System.out.println("發生了"+e+"這個例外");
		}
		finally {
			System.out.println("最後一定要執行這個");
		}
		System.out.println("順利執行完畢");

	}

}
