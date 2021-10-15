package string.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Anushka Kashyap on 10/15/2021.
 */
public class FindRepetedWord {


    static int findRepetedFirstFunctional(String word) {

        //break String into array
        List<Character> list = new ArrayList<>();
        for (char c : word.toCharArray()) {
            list.add(c);
        }
        System.err.println(list);
        Set<Character> dup = new HashSet<>();
        List<Character> collect = list.stream().filter(li -> !dup.add(li)).collect(Collectors.toList());
        System.err.println("duplicate are "+collect);
        return 0;
    }


    static int findRepetedFirst(String line) {

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
        String word = "susheel";
//        int repetedFirst = findRepetedFirst(word);
//        if (repetedFirst == -1) {
//            System.err.println("no word found");
//        } else {
//            System.err.println(word.charAt(repetedFirst));
//        }
        findRepetedFirstFunctional(word);
    }


}

