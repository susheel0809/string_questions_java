package string.questions;

import java.util.StringJoiner;

public class StringJoinerClass {

    static void stringJoiner(){
        StringJoiner joiner = new StringJoiner("|", "?", ":::");
        joiner.add("Red")
                .add("Green")
                .add("Blue");

        System.err.println(joiner.toString());
    }

    public static void main(String[] args) {
        stringJoiner();
    }
}
