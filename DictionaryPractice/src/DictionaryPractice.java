import java.util.HashMap;
import java.util.Map;

/**
 * Created by johnsabilla on 7/3/17.
 */
public class DictionaryPractice
{
    public static void main(String[] args) {
        //English to Spanish
        Map<String, String> englishToSpanish = new HashMap<String, String>();

        //putting things in dictionary
        englishToSpanish.put("Monday", "Lunes");
        englishToSpanish.put("Tuesday", "Martes");
        englishToSpanish.put("Wednesday", "Miercoles");
        englishToSpanish.put("Thursday", "Hueves");
        englishToSpanish.put("Friday", "Viernes");
        englishToSpanish.put("Saturday", "Sabado");
        englishToSpanish.put("Sunday", "Domingo");

        //get values using keys
        System.out.println(englishToSpanish.get("Monday"));
        System.out.println(englishToSpanish.get("Tuesday"));
        System.out.println(englishToSpanish.get("Wednesday"));
        System.out.println(englishToSpanish.get("Thursday"));
        System.out.println(englishToSpanish.get("Friday"));
        System.out.println(englishToSpanish.get("Saturday"));
        System.out.println(englishToSpanish.get("Sunday"));

        //keys not really in order of insertion
        System.out.println(englishToSpanish.keySet());
        //values not really in order of insertion
        System.out.println(englishToSpanish.values());

        System.out.println(englishToSpanish.size());

        System.out.println(englishToSpanish.toString());
    }
}
