package utils;

import java.util.Spliterator;
import java.util.StringJoiner;

/**
 * @author wuxuan
 * @since 2022/6/15 9:43 AM
 */
public class Printer {

    public static  String printIntArray(int[] array) {
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int t : array) {
            stringJoiner.add(String.valueOf(t));
        }
        return stringJoiner.toString();
    }
}
