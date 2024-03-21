
public class Largestnum {

	public static void main(String[] args) {
		int[] numbers= {40,50,60};
		int largest = numbers[0];
		for (int i=1; i< numbers.length;i++)
		{
			if(numbers[i] > largest)
			{		
			  largest = numbers[i];
			}
		}
		System.out.println(" largest num in array :" +largest);
	} 
	
}
