package string.questions;

import java.util.stream.Stream;
public class SplitStringUsingStream {

    static void splitUsingStream(String string_to_split, String separator) {
        Stream<String> split = Stream.of(string_to_split.split(separator));
        System.err.println("split array-> " + split.toString());
        split.forEach(System.out::println);

    }


    public static void main(String[] args) {
        splitUsingStream("s,u,s,h,e,e,l", ",");
    }
}
