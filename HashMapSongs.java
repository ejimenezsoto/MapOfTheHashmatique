import java.util.HashMap;
import java.util.Set;

public class HashMapSongs {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
    
        trackList.put("While My Guitar Gently Weeps", "Still my guitar gently weeps");
        trackList.put("A Day in the Life", "I read the news today, oh boy");
        trackList.put("I Want to Hold Your Hand", "It's such a feeling that my love");
        trackList.put("Strawberry Fields Forever", "Living is easy with eyes closed");
        trackList.put("Yesterday", "Yesterday, All my troubles seemed so far away");
        trackList.put("In My Life", "All these places have their moments");
        
        System.out.println(trackList.get("Yesterday"));

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }

    }
}