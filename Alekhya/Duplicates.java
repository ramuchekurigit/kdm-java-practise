public class Duplicates
{
 
	public static void main(String[] args)
	{
		
		String inputString = "Java Programming";
 
        System.out.println("Duplicate characters in the string \"" + inputString + "\":");
        printDuplicateCharacters(inputString);
    }
 
    
    static void printDuplicateCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            	
            if (currentChar != ' ' && str.indexOf(currentChar, i + 1) != -1) {
                System.out.println(currentChar);
            }
        }
	}
 
}
 