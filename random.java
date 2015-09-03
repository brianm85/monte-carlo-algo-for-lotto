import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class random {
	public static void main(String args[])
	{
		int num=1;
		Random rangen = new Random();
		for(int i =0; i<num;i++)
		{
		 Set<Integer>numberDrawn= new HashSet<Integer>();
		 do
		 { 
			 System.out.println(i+"  " + numberDrawn.add(rangen.nextInt(45)+1)); 
		 }
		 while(numberDrawn.size()<6);
		}
		System.out.println();
	}

}
