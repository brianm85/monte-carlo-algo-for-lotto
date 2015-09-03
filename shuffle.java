import java.util.*;
import java.util.Collections;
public class shuffle {
	public static void main(String args[])
	{
		int count = 0;//count	
		int monte=1000000;//monte carlo algo
		
		for(int num=0; num<monte; num++)
		{ //start of loop 
			List<Integer> myarr = new ArrayList<Integer>();//declare array list
			
			for(int i =1; i<46;i++)
			{
				myarr.add(i);//add numbers from 1 to 45 to the list
				 
			}
			 Collections.shuffle(myarr); //shuffle the numbers
			 
			 List<Integer> shortlist = myarr.subList(0, 5);//take the first 6 off the shuffled array
			 
			 Collections.sort(shortlist);//then sort the 6 numbers in order
			 /*//comented out
			 for(int value : shortlist)//how does this loop work
			 {
				 System.out.println(value);//used to check all was ok so far
			 }
			 *///comented out
			 Integer[] array = {};//declare array
			 array = shortlist.toArray(array);//add six numbers to the array
			 
			 for(int i=0; i<array.length-1; i++)//loop for array
			 {
				  if(array[i+1] == array[i])//check for none of the same numbers
				  {
					  break;//break out if there is, not to sure about this
				  }
				  else if(array[i+1]+1==array[i])//have no clue what to do here
				  {
					  count++;//add to the count
				  }
				  else if(array[i+1]-1==array[i])
				  {
					  count++;
				  }
				  else
				  {
					  continue;//do nothing i think
				  }
			 }
		}
		 double probability = count/monte;//double to check the probability.
		 System.out.println(probability);//print the result
		
	}

}
