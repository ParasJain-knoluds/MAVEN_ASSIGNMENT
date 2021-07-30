public class StringFunction {
    public static String reverseString(String s){
        StringBuilder reversed_string = new StringBuilder();
        //Method which return the size of the string.
        reversed_string.append(s);
        //Method which return reverse string.
        reversed_string.reverse();
        return String.valueOf(reversed_string);
    }
    public static int sizeofString(String s){

        return s.length();
    }
}
