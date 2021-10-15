package string.questions;

/**
 * Created by Anushka Kashyap on 10/15/2021.
 */
public class ReverseString {


    public static void main(String[] args) {
        String text = "abc";
        String nstr = "";
        char ch;

        for (int i = 0; i < text.length(); i++) {

            //extract each character

            ch = text.charAt(i);
            //add each character in front of existing String
            nstr=ch+nstr;


        }

        System.err.println(nstr);
    }
}
