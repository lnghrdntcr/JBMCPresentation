
class A1{
	int method(){
		return 1;
	}
};


class A2 extends A1 {
	int method(){
		return 2;
	}
};

class A3 extends A2 {
	int method(){
		return 3;
	}
};

class Main {
  public static void main(String[] args) {
	A1 a1 = new A1();
	A2 a2 = new A2();
  	A3 a3 = new A3();

	assert a1.method() == 1;
	assert a2.method() == 2;
	assert a3.method() == 3;

  }
}
