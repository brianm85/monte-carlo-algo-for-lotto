import java.util.Random;
public class Lotto {
	Random rangen = new Random();
	private int result;
	
	public Lotto()
	{
		result = spin();
	}
	public int getSpin()
	{
		return spin();
	}
	private int spin()
	{
		return rangen.nextInt(45)+1;
	}

}
