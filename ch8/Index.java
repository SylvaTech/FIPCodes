/**Ex. 8.4.
*/
public class Index{

	public static int indexOfMax(int[] numbers){
		int index = 0;
		for (int i=1;i<numbers.length;i++){
			 if (numbers[i] > numbers[index]){
				index = i;
			 }
		}
		return index;
	}

	public static void main(String[] args){
		int[] numbers = {2,5,10,3};
		int index = indexOfMax(numbers);

		System.out.println("The index of the highest number is "+index);

	}
}