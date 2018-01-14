/**Ex.8.6

*/
public class Factors{

 	public static boolean areFactors(int n, int[] factors){
		boolean flag = true;
		 for (int factor:factors){
			if (n % factor != 0){
				flag = false;
				System.out.println(factor + " is not a factor");
		 	 }
		  	else{
				System.out.println(factor + " is a factor");
			}
		}
		 return flag;
	 }
   	public static void main(String[] args){
		int[] factors ={2,4,6,8,20};
		int n = 100;
		boolean checkFactors = areFactors(n, factors);

	}
}