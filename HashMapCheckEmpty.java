/*
 ************************************ First Question  ********************************.
 Q1) Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.
*/

/*
  Name = VISHAL SHARMA .
*/
import java.util.HashMap;
import java.util.Map;

public class HashMapCheckEmpty {
    public static void main(String[] args) {
        // Create an empty HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Check if the HashMap is empty
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }
    }
}
/*
  output
HashMap is empty
*/









/*
 ************************************ Second Question  ********************************.
 Q2) write a program in Java to create a Map Interface where we can store the cricketer
     name in it along with his scores and search for the batsman name and display his score.
*/


/*
  Name = VISHAL SHARMA .
*/

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
/*
  output.
Virat Kohli's score: 120
*/
