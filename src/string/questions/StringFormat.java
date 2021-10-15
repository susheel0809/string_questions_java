package string.questions;

/**
 * Created by Anushka Kashyap on 10/15/2021.
 */
public class StringFormat {

    static void stringFormatter(float f) {

        System.err.println(String.format("%.1f", f));

    }

    public static void main(String[] args) {
        stringFormatter(101.00f);
    }
}
