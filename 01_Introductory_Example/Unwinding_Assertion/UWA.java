/*
 *
 * If launched with --unwinding <= 10 the verification passes
 * this is due to the fact that after < 10 iterations the
 * execution still does not exits the `for` loop.
 *
 *
 * If launched with --unwinding > 10 than the loop is fully unwinded 
 * so the final assetion can be verified to be always false.
 *
 */

public class UWA {

	public static void main(String[] args){
		
		/* assert(false); */
		boolean assertion = false;

		for(int i = 0; i < 10; i++){
			
			if(i == 25){
				assertion = true;
			}

		}

		assert(assertion);

	}

}
