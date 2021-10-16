package string.questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Anushka Kashyap on 10/15/2021.
 */
public class FindRepetedWord {


    static int findRepeatedFirstFunctional(String word) {

        //break String into array
        List<Character> list = new ArrayList<>();
        for (char c : word.toCharArray()) {
            list.add(c);
        }
        System.err.println(list);
        Set<Character> dup = new HashSet<>();
        List<Character> collect = list.stream().filter(li -> !dup.add(li)).collect(Collectors.toList());
        System.err.println("duplicate are " + collect);

        word.toCharArray();
        List<Character> arrayList = new ArrayList<>();

        for (char c : word.toCharArray()) {
            arrayList.add(c);
        }
        dup.clear();
        List<Character> collect1 = arrayList.stream().filter(data -> !dup.add(data)).collect(Collectors.toList());
        System.err.println(collect1+"collect1");


        return 0;
    }


    static long noOfTimesWordRepeated(String word, char ch) {

        long count = word.chars().filter(c -> c == ch).count();
        System.err.println(count);
        return count;
    }


    static int findRepeatedFirst(String line) {

        int p = -1, i, j;

        for (i = 0; i < line.length(); i++) {

            for (j = i + 1; j < line.length(); j++) {

                if (line.charAt(i) == line.charAt(j)) {
                    p = i;
                    break;
                }
                if (p != -1) {
                    break;
                }

            }

        }

        return p;
    }

    public static void main(String[] args) {
        String word = "susheelsss";
//        int repetedFirst = findRepetedFirst(word);
//        if (repetedFirst == -1) {
//            System.err.println("no word found");
//        } else {
//            System.err.println(word.charAt(repetedFirst));
//        }
        findRepeatedFirstFunctional(word);
        char ch='s';
        noOfTimesWordRepeated(word,ch);
    }


}

