public class StringFunction {
    public static String reverseString(String s){
        StringBuilder reversed_string = new StringBuilder();
        //use here to append the string
        reversed_string.append(s);
        //use here to reverse the string
        reversed_string.reverse();
        return String.valueOf(reversed_string);
    }
    public static int sizeofString(String s){
        return s.length();
    }
}
