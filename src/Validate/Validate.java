package Validate;

import java.util.Scanner;

public class Validate {
    public static final String REGEX_STRING = "[A-Z][\\sA-Za-z]+";
    public static final String REGEX_CODE = "[A-Z0-9]{3}";
    public static final String REGEX_ACCOUNT = "[A-Za-z0-9]{6,10}";
    public static final String REGEX_EMAIL = "[A-Za-z0-9]+@[a-z]+.[com |vn]+";
    public static final String REGEX_NUMBER = "[0-9]+";
    public static final String REGEX_PHONE = "(0)+([0-9]{9})\\b";
    static Scanner scanner = new Scanner(System.in);


    public static int regexNumber(String regex) {
        while (true) {
            String number = scanner.nextLine();
            if (number.matches(regex)) {
                return Integer.parseInt(number);
            } else System.err.println("Enter the wrong format, re-enter :");
        }
    }

    public static String regexString(String regex) {
        while (true) {
            String string = scanner.nextLine();
            if (string.matches(regex)) {
                return string;
            }
            System.err.println("Enter the wrong format, re-enter :");
        }
    }
}
