import java.util.HashMap;
import java.util.Map;

public class CricketerScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Add cricketer names and their scores
        cricketerScores.put("Virat Kohli", 120);
        cricketerScores.put("Rohit Sharma", 90);
        cricketerScores.put("MS Dhoni", 50);

        // Search for a batsman and display his score
        String batsman = "Virat Kohli";
        if (cricketerScores.containsKey(batsman)) {
            System.out.println(batsman + "'s score: " + cricketerScores.get(batsman));
        } else {
            System.out.println(batsman + " not found in the records");
        }
    }
}
