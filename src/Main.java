import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String input = "t3e1st Hell1o t1h1e fir2st1";
        String expectedResult = "Hello the first test";
        String result = getResult(input);
        if (expectedResult.equals(result)) {
            System.out.println("Tebrikler!");
        }
    }

    private static String getResult(String input) {
        String result = "";
        Map<Integer, String> map = splitWord(input);
        for (int i=1; i <= map.size(); i++) {
            result += map.get(i);
            if (i != map.size()) {
                result += " ";
            }
        }

        return result;
    }

    public static Map<Integer, String> splitWord(String word) {
        Map<Integer, String> resultMap = new HashMap<>();
        String[] worlds = word.split(" ");



        for (String world : worlds) {
            int sum = 0;
            String cleanString = "";
            for (char character : world.toCharArray()) {
                if (Character.isDigit(character)) {
                    sum += Character.getNumericValue(character);
                } else {
                    cleanString += character;
                }
            }
            resultMap.put(sum, cleanString);
        }
        return resultMap;
    }
}