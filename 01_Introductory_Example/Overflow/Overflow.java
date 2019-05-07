
class Overflow {

	public static void main(String args[]) throws Exception{

		int a = System.in.read();

		if(a < 0) return;
		a++;

		assert a > 0;

	}
}
