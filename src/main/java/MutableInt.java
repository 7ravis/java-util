
public class MutableInt {

    private int value;

    /**
     * value initialized as provided startingValue
     */
    public MutableInt(int startingValue) {
	value = startingValue;
    }

    /**
     * value initialized as 0
     */
    public MutableInt() {
	value = 0;
    }

    /**
     * add one to value
     */
    public void increment() {
	value++;
    }

    /**
     * add provided number to value
     */
    public void add(int number) {
	value = value + number;
    }

    public int getValue() {
	return value;
    }

}
