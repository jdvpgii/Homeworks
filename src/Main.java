import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static String getLorem() {
        return lorem;
    }

    public static void main(String[] args) {
        WordsChecker wordsChecker = new WordsChecker(lorem);
        Map<Character, Integer> letters = new HashMap<>();

        char[] chars = getLorem().toCharArray();

        for (Character ch : chars) {
            if (!letters.containsKey(ch) & Character.isLetter(ch)) {
                letters.put(ch, 1);
            } else {
                for (Map.Entry<Character, Integer> pair : letters.entrySet()) {
                    int x = pair.getValue() + 1;
                    letters.replace(ch, pair.getValue(), x);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char charMax = ' ';
        char charMin = ' ';

        for (Map.Entry<Character, Integer> pair :
                letters.entrySet()) {
            if (pair.getValue() < min) {
                min = pair.getValue();
                charMin = pair.getKey();
            }
            if (pair.getValue() > max) {
                max = pair.getValue();
                charMax = pair.getKey();
            }
        }
        System.out.println(charMin + ": " + min);
        System.out.println(charMax + ": " + max);

        System.out.println(wordsChecker.hasWord("hello"));
        System.out.println(wordsChecker.hasWord("dolore"));
    }
}