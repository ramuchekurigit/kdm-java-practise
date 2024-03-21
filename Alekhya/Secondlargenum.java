
public class Secondlargenum {

	public static void main(String[] args)
	{
		int [] Array = {20,30,40};
		
		  int secondLargest = findSecondLargest(Array);
		  
	        System.out.println("The second largest number in the array is: " + secondLargest);
	    }
	 
	    static int findSecondLargest(int[] arr)
	    {
	        int i = Integer.MIN_VALUE;
	        int j = Integer.MIN_VALUE;
	 
	        for (int num : arr) {
	            if (num > i) {
	                j = i;
	                i = num;
	            }
	            else if (num > j && num != i) {
	                j = num;
	            }
	        }
	 
	        return j;
		
	}

}
