/** Ex 5.5.
		This program uses a recursive method to write the lyrics of the song
		"99 bottles of beer".
	*/
public class TheBottlesSong{

	private static void reduceBottles(int b){
		int reduced = b-1;
		if(b>0 && reduced>0){
			System.out.print(" " + b+" bottles of beer on the wall,\n " + b +" bottles of beer,                                                                        \n ya' take one down, \n ya' pass it around,\n ");
			System.out.println(reduced + " bottles of beer on the wall.\n ");
			reduceBottles(reduced);
		}
		else if(b == 0 || reduced == 0){
			//Sing the no bottle lyrics of the song.
			noBottleLyrics();
		}

	}
	private static void noBottleLyrics(){
		System.out.print(" No bottles of beer on the wall no bottles of beer,                                                                                          \n ya' can't take one down,\n ya' can't pass it around,                                                                                      \n 'cause there are no more bottles of beer on the wall!\n ");
	}
	public static void main(String[] args){
		reduceBottles(99);
	}
}