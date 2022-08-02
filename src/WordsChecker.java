import java.util.HashSet;
import java.util.List;

public class WordsChecker {
    private String string = "";

    public WordsChecker(String string) {
        this.string = string;
    }

    public boolean hasWord(String word) {
        HashSet<String> set = new HashSet<>(List.of(string.split("\\P{IsAlphabetic}+")));
        return set.contains(word);
    }
}
