package Selection;
import java.util.*;

public class UniqueCharacterCount {
	public static void main(String[] args) {
		String input = "Hello World";
		input = input.toLowerCase();
		HashSet<Character> uniqueChars=new HashSet<>();

		for (char c : input.toCharArray()) {
			uniqueChars.add(c);
		}

           System.out.println("Unique character count:"+ uniqueChars.size());

      }

}