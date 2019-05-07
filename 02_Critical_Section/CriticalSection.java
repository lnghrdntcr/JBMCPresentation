
class CriticalSection extends Thread{

	static int block = 0;
	static boolean[] inCritSect = new boolean[2];

	private int i;
	public CriticalSection (int i){
		super();
		this.i = i;
	}

	@Override
	public void run(){

		while(block == 1);
		block = 1;
		inCritSect[this.i] = true;
		
		//System.out.println("T: " + this.i + " enter critical section");
		assert(!(inCritSect[0] && inCritSect[1]));
		// Critical section

		inCritSect[this.i] = false;
		//System.out.println("T: " + this.i + " exit critical section");
		block = 0;

		return;
	}

	public static void main(String args[]) throws Exception {

		for(int i = 0; i < 2; i++){
			inCritSect[i] = false;
		}

		Thread a = new CriticalSection(0);
		Thread b = new CriticalSection(1);

		a.start();
		b.start();

		a.join();
		b.join();

	}

}
