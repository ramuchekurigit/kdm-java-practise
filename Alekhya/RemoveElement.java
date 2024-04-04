public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int elementToRemove = 3;

        int indexToRemove = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, newArr.length);
            arr = newArr;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}