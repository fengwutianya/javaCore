import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by xuan on 16-11-7.
 */
public class MyComparator {
    public static void main(String[] args) {
        String[] strings = {"zhu", "zhen", "xuan", "is", "a", "genius"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, new LengthComparator());
        System.out.println(Arrays.toString(strings));
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
