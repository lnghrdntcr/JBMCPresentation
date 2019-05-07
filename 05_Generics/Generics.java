public class Generics<T> {

	private T t;

	public void setT(T t){
		this.t = t;
	}
	
	/**
	 * We used Object instead of T
	 * Due to the instanceof trhowing errors at compile time 
	 * because static versions of the Generics class being produced.
	 *
	 **/

	public Object getT(){
		return this.t;
	}


	public static void main(String args[]){
	
		Generics<String> s = new Generics<>();
		Generics<Thread> t = new Generics<>();

		s.setT("Hello Classmates!");
		t.setT(new Thread());

		assert s.getT() instanceof String;
		assert t.getT() instanceof Thread;

		assert !(t.getT() instanceof String);

	}

}
