import java.util.Arrays;
public class check{

	public static void main(String args[]) {
		int counter = 0;

		for(int k=0;k<10000000;k++) {
			int[] lotto = new int[6];
			do{
				for(int i=0; i<lotto.length; i++){
					lotto[i] = (int) ((Math.random()*45) + 1);
				}
			}while(!check(lotto));
			Arrays.sort(lotto);
			for(int i =0;i<lotto.length-1;i++) {
				if((lotto[i]+1) == lotto[i+1]) {
					counter++;
					break;
				}
			}
		}
		double chance = 1 - ((double) counter / 10000000);
		System.out.println("The chance of no consecutive pairs is: " + chance);

	}

	public static boolean check(int[] array) {
		for(int i = 0; i<(array.length-1); i++) {
			for(int k = i+1;k<array.length;k++) {
				if(array[i] == array[k]) {
					return false;
				}
			}
		}
		return true;
	}
}