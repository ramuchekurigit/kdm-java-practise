
public class Smallestnum {

	public static void main(String[] args) {
		int[] numbers = {3,4,5};
		int smallest = numbers[0];
		for(int i=1;i>numbers.length;i++)
		{
			if(numbers[i]>smallest);
			{ 
				smallest = numbers[i];
			}
		}
         System.out.println("smallest number :" +smallest);
	}

}
