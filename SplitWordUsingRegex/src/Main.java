import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "python language";
        String str1 = "python";
        String str2 = "python-object";
        String str3 = "python,object";

        //        String delimiters = "-|\\s+|,\\s*|\\.\\s*";
        String delimiters = "-|\\s+|,";

        System.out.println(str + " is split into :: " + Arrays.toString(str.split(delimiters)));
        System.out.println(str1 + " is split into :: " + Arrays.toString(str1.split(delimiters)));
        System.out.println(str2 + " is split into :: " + Arrays.toString(str2.split(delimiters)));
        System.out.println(str3 + " is split into :: " + Arrays.toString(str3.split(delimiters)));
    }
}