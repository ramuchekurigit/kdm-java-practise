
public class SumArray {

	public static void main(String[] args) {
        
        int[] Array = {1, 2, 3, 4, 5};

        int arraySum = 0;

        
        for (int i = 0; i < Array.length; i++) {
            arraySum += Array[i];
        }

      
        System.out.println("The sum of the array is: " + arraySum);
    }

}
