import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CharacterCounter {
    // class variables

    // constructors
    public CharacterCounter() {

    }
    // methods
    public void countCharacters(String wordToCount) {

        // place case-insensitive here.
        wordToCount = wordToCount.toLowerCase();

        char[] arrayOfChars = wordToCount.toCharArray();
        HashMap<Character, Integer> myCharacterCount = new HashMap<>();
        for (int i = 0; i < arrayOfChars.length; i++) {

            // Exclude non-alphabetic characters
            if(!Character.isLetter(arrayOfChars[i])) {
                // Exclude letter
                continue;

            }

            // add or update the count of each character into the hashmap

            char theCharacter = arrayOfChars[i];
            if (myCharacterCount.containsKey(theCharacter) == false) {
                // Does not contain the key
                myCharacterCount.put(theCharacter, 1);

            } else {
                // Does contain the key
                Integer theValue = myCharacterCount.get(theCharacter);
                theValue = theValue + 1;
                myCharacterCount.put(theCharacter, theValue);
            }
        }

        ArrayList<Character> myCharacterKeys = new ArrayList<>(myCharacterCount.keySet());
        for(int i = 0; i < myCharacterKeys.size(); i++) {
            Integer theValue = myCharacterCount.get(myCharacterKeys.get(i));
            System.out.println(myCharacterKeys.get(i) + ":" + theValue);
        }
    }

public String getUserInput() {
        Scanner myScanner = new Scanner(System.in);

        String myUsersInput = myScanner.nextLine();

        myScanner.close();

        return myUsersInput;
}

public String getTextFromFile(String pathToFile) {
        String content = "";
    try {
        content = new String(Files.readAllBytes(Paths.get(pathToFile)));
    } catch(Exception exception) {
        exception.printStackTrace();
    }
    return content;
}



}
