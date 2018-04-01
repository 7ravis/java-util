import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * count how many times {@link String} keys are added
 */
public class CountMap {

    private Map<String, MutableInt> map = new HashMap<>();

    /**
     * increment (by 1) the count for the provided {@link String}. this method is
     * intended for both keys that have been added previously and new keys.
     */
    public void add(String key) {
	if (map.containsKey(key)) {
	    map.get(key).increment();
	} else {
	    map.put(key, new MutableInt(1));
	}
    }

    /**
     * @return the number of times the key was added using the {@link #add(String)}
     *         method
     */
    public int getCount(String key) {
	if (map.containsKey(key)) {
	    return map.get(key).getValue();
	} else {
	    return 0;
	}
    }

    /**
     * @return {@link Collection} of unique keys that have been added using the
     *         {@link #add(String)} method
     */
    public Collection<String> keySet() {
	return map.keySet();
    }

}