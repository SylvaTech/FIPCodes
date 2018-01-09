public class FermatsTheorem{
	/** Ex. 5.4.
		This program is aimed at proving Fermat's last theorem
		which states that there are no integers a, b, and c such
		that a^n + b^n = c^n, except when n <= 2.
	*/
	private static void checkFermat(int a, int b, int c, int n){
		double aRaised = Math.pow(a,n);
		double bRaised = Math.pow(b,n);
		double cRaised = Math.pow(c,n);

		double sumAB = aRaised + bRaised;
		System.out.println("a power n is " + aRaised);
		System.out.println("b power n is " + bRaised);
		System.out.println("c power n is " + cRaised);
		System.out.println("sum of a power n and b power n is " + sumAB);


		if(n>2 && sumAB == cRaised){
			System.out.println("Holy smokes Fermat was wrong");
		}
		else{
			System.out.println("No that doesnt work");
		}
	}
	public static void main (String[] args){
		checkFermat(2,4,3,4);
	}
}