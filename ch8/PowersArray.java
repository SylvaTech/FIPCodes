public class PowersArray{

public static double[] powArray(double[] array, double power){
      double[] powersArray = new double[array.length];
      System.out.print("{");
      for (int i=0;i<array.length;i++){
         powersArray[i] = Math.pow(array[i],power);
         System.out.print(powersArray[i] + ",");
      }
		System.out.println("}");
      return powersArray;
   }

   public static int[] histogram(int[] array, int count){
      int[] counter = new int[count];
      for (int element:array){
         counter[element]++;
      }
      return counter;
   }
   	public static void main(String[] args){
		double [] inputArray = {1.0, 2.0, 3.0};
		double power = 2;
		powArray(inputArray, power);


	}
}