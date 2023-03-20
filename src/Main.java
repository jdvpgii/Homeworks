import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static String getLorem() {
        return lorem;
    }

    public static void main(String[] args) {
        Map<Character, Integer> letters = new HashMap<>();

        char[] chars = getLorem().toCharArray();

        for (Character ch : chars) {
            if (!letters.containsKey(ch)) {
                letters.put(ch, 1);
            } else {
                for (Map.Entry<Character, Integer> pair : letters.entrySet()) {
                    int x = pair.getValue() + 1;
                    letters.replace(ch, pair.getValue(), x);
                }
            }
        }

        for (Map.Entry<Character, Integer> pair :
                letters.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }
    }
}
