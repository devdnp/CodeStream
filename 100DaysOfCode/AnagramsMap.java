import java.util.HashMap;
import java.util.Map;

public class AnagramsMap {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String a1 = "listen";//scan.next();
        String b1 = "silent" ;//scan.next();
        boolean result = isAna(a1, b1);
        
        System.out.println(result);
    }
    static boolean isAna(String a1, String b1){
        Map<Character, Integer> a1Map = new HashMap<Character, Integer>();
        Map<Character, Integer> b1Map = new HashMap<Character, Integer>();

        Character ch;
        for (int i = 0; i < a1.length(); i++) {
            ch = a1.charAt(i);
            if (a1Map.get(ch)==null) {
                a1Map.put(ch, 1);
            }else{
                a1Map.put(ch, (a1Map.get(ch)+1));
            }
        }
        for (int i = 0; i < b1.length(); i++) {
            ch = b1.charAt(i);
            if (b1Map.get(ch)==null) {
                b1Map.put(ch, 1);
            }else{
                b1Map.put(ch, (b1Map.get(ch)+1));
            }
        }
        return a1Map.equals(b1Map);
    }
}
