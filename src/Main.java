public class Main {

    public static void main(String[] args) {
      CharacterCounter myCharacterCounter = new CharacterCounter();
      //String myUserInput = myCharacterCounter.getUserInput();
        String myUserInput = myCharacterCounter.getTextFromFile( "example.txt");
        myCharacterCounter.countCharacters(myUserInput);
   }
}
