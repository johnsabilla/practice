import java.util.Map;
import java.util.Scanner;
import java.util.*;

/**
 * Created by johnsabilla on 6/26/2017.
 */
public class RansomNote
{
        Map<String, Integer> magazineMap;
        Map<String, Integer> noteMap;

        public RansomNote(String magazine, String note) {
            magazineMap = new HashMap<String, Integer>();
            noteMap = new HashMap<String, Integer>();
            String[] magazineArray = magazine.split(" ");
            String[] noteArray = note.split(" ");

            for( String word : magazineArray){
                Integer count = magazineMap.get(word);

                if(count == null){
                    magazineMap.put(word, 1);
                }
                else {
                    magazineMap.put(word, count + 1);
                }
            }

            for( String word: noteArray) {
                Integer count = noteMap.get(word);

                if(count == null) {
                    noteMap.put(word, 1);
                }
                else {
                    noteMap.put(word, count+1);
                }
            }
        }

        public boolean solve() {
            boolean isValid = true;
            for(Map.Entry<String, Integer> entry : noteMap.entrySet()) {
                    Integer count = magazineMap.get(entry.getKey());

                    if(count == null) {
                        isValid = false;
                    }
                    if(entry.getValue() > count){
                        isValid = false;
                    }
            }
            return isValid;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int m = 6;
            int n = 4;

            // Eat whitespace to beginning of next line
            //scanner.nextLine();

            RansomNote s = new RansomNote("give me one grand today night", "give one grand today");
            scanner.close();

            boolean answer = s.solve();
            if(answer)
                System.out.println("Yes");
            else System.out.println("No");

        }


}
