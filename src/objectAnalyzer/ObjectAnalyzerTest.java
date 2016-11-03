package objectAnalyzer;

import java.util.ArrayList;

/**
 * Created by xuan on 16-11-3.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            squares.add(i*i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
