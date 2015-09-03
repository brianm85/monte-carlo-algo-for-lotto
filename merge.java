
public class merge {
	public void mergeSort(int[] arr, int low, int high)//recursive merge
{
	if(low == high)//if sorted already
		return;
	else
	{
		int mid = (low + high)/2;//find half way
		mergeSort(arr, low, mid);//sort low half
		mergeSort(arr, mid+1, high);//sort high half
	}
	
}

}
