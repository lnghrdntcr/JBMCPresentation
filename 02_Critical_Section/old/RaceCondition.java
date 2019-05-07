
class RaceCondition {

	public static void main(String args[]){
	
		int a = 0;
		boolean flag = false;
		boolean shouldStop = false;

		Thread t1 = new Thread(() -> {
		
			while(!shouldStop){
				if(flag){
					a += 1;
					flag = false;
				}
			}

		});

		Thread t2 = new Thread(() -> {
		
			while(!shouldStop){
				if(!flag){
					a -= 1;
					flag = true;
				}
			}

		});

		t1.start();
		t2.start();

		Thread.sleep(10000);
		shouldStop = true;

		assert(a == 0);

	
	}


}

