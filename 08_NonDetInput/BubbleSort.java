/**
 * Can we model user input? 
 * YES! With nondet{Int, Double, String}
 */

import org.sosy_lab.sv_benchmarks.Verifier;
import java.util.Arrays;

public class BubbleSort {
	static int N = 5;
	/*
	 * @
	 * @requires a!=null && a.length>=1;
	 * @ensures a!=null && 
	 * a.length>=1 ==> a.length == \old(a).length && 
	 * (\forall int i; 0<=i && i<a.length-1; \exists int j; 0<=j && j<a.length;a[j] == \old(a)[i]) && (\forall int i; 0<=i && i<a.length-1); 
	 * @ a[i]<=a[i+1])
	 *
	 */

	void sort(int[] a) {
		
		assert(a != null);
		assert(a.length >= 1);

		int[] oldA = (int[]) a.clone();
		
		int i, j, t;
		for (j = 0; j < N - 1; j++) {
			for (i = 0; i < N - j - 1; i++) {
				if (a[i] > a[i + 1]) {
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		
		}

		assert(oldA.length == a.length);
		for(int el: oldA){
			assert(contains(a, el));
		}
		assert(test(a));


	}
	
	boolean contains(int[] a, int element){
	
		for (int i = 0; i < N; i++){
			if (a[i] == element) {
				return true;
			}
		
		}

		return false;

	}

	boolean test(int[] a) {
		int i;
		for (i = 0; i < N - 1; i++)
			if (a[i] > a[i + 1]) {
				return false;
			}
		return true;
	}

	public static void main(String[] args) {

		int[] a = new int[N];
		for(int i = 0; i < N; i++){
			a[i] = Verifier.nondetInt();		
		}

		BubbleSort e = new BubbleSort();
		e.sort(a);
	}

}
