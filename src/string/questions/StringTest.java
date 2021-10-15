package string.questions;


public class StringTest {


    public static void main(String[] args) {


        //two ways to define a String by primitive data type
        String myString = "Susheel";
        //2nd is using String class

        String mySecondString = new String("Susheel");

        System.err.println(myString.equals(mySecondString) + " using equals method ");
        boolean b = myString == mySecondString;
        System.err.println(b + " using == ");

//        The method intern() creates
//        an exact copy of a String object
//        in the heap and stores it in the String constant pool, which the JVM maintains.


//        We can call the intern() method to tell the JVM to add it
// to the string pool if it doesn't already exist there, and return a reference of that interned string

        b = myString == mySecondString.intern();
        System.err.println(b + " using == intern");


        StringTest stringTest = new StringTest();
        stringTest.StringToInteger();

        stringTest.StringFormat();


    }

    private void StringFormat(){
        String title="Susheel";
        String format = String.format("Title is", title);
        System.err.println(title.equals(format)+" format");
    }


    private void StringToInteger() {

        //String class comes from java.lang package
        String val = "22";
        //Integer is a class from java.lang package
        int newIntVal = Integer.parseInt(val);
        System.err.println(newIntVal + " " + val + " String to int ");

        val = Integer.toString(newIntVal);
        System.err.println(val+"Integer to string ");


    }
}
