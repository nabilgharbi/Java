import java.util.HashMap;
import java.util.Set;
public class HashMatique {
    public static void main(String[] args) {
        HashMap<String, String> tracklist = new HashMap<>();

        tracklist.put("Song 1", "lyrics 1");
        tracklist.put("Song 2", "lyrics 2");
        tracklist.put("Song 3", "lyrics 3");
        tracklist.put("Song 4", "lyrics 4");

        System.out.println(tracklist.get("Song 1"));

        Set<String> keys = tracklist.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + tracklist.get(key));
        }
    }
}