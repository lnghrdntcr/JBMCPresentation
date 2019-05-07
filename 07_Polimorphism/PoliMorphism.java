class PoliMorphism {

	String add(String a){
		return a + a;
	}

	Integer add(Integer a){
		return a + a;
	}

	public static void main(String args[]){

		PoliMorphism p = new PoliMorphism();

		assert p.add("Hello World!") instanceof String;
	       	assert p.add(42) instanceof Integer;	
	
	}

}
