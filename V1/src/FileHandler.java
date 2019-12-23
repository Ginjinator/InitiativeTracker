import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler implements Serializable {

    private ArrayList<String> characters;
    private String characterNameFile = "CharactersNames.txt";
    private String characterNamePath = "C:/Users/erike/IdeaProjects/IntiativeTracker/CharacterNames.txt";

    public ArrayList<String> getCharacters() throws IOException{
        this.setCharacters();
        return characters;
    }

    public void setCharacters() throws IOException {
        Scanner scanner = new Scanner(new File(characterNamePath));
        characters = new ArrayList<String>();
        while (scanner.hasNext()) {
            characters.add(scanner.next());
        }
        scanner.close();
    }
}
