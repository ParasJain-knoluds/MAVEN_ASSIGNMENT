public class Application {
    public static void main(String[] args) {

        String name ="Maven Assignment";
        //StringFunctions class is from sub-module named as <string-api>
        int size = StringFunction.sizeofString(name);
        String reversed_string = StringFunction.reverseString(name);
        System.out.println(size+"\n"+reversed_string);
    }
}
