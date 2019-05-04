package saikia.priyam.smart.algos;

public class Day4 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        isStringOnlyAlphanumeric("PriyamSaikia786868");
//        generateRandomString(234);
//        moveSpecialCharactersToEnd("p!r@i#y$a%m^s&a*i*k(i)a- ");
    }

    static void moveSpecialCharactersToEnd(String someString) {
        StringBuilder specialCharString = new StringBuilder();
        StringBuilder nonSpecialCharacterString = new StringBuilder();
        String regEx = "[a-zA-Z0-9+]";
        char[] charArray = someString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (String.valueOf(charArray[i]).matches(regEx)) {
                nonSpecialCharacterString.append(charArray[i]);
            } else {
                specialCharString.append(charArray[i]);
            }
        }
        System.out.println("The new string is " + nonSpecialCharacterString.append(specialCharString));
    }

    static void generateRandomString(int length) {
        String completeString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int a = (int) (Math.random() * (completeString.length()));
            randomString.append(completeString.charAt(a));
        }

        System.out.println("Random string is " + randomString);
    }

    static void isStringOnlyAlphanumeric(String inputString) {
        char[] charArray = inputString.toCharArray();
        boolean isStringOnlyAlphaNumeric = true;
        for (int i = 0; i < inputString.length(); i++) {
            if ((charArray[i] >= 'A' && charArray[i] <= 'Z')
                    || (charArray[i] >= 'a' && charArray[i] <= 'z')
                    || (charArray[i] >= '0' && charArray[i] <= '9')) {
                //only alpha-numerics
                //do nothing
            } else {
                isStringOnlyAlphaNumeric = false;
                break;
            }

        }
        System.out.println("Is string " + inputString + " alpha-numeric only? " + isStringOnlyAlphaNumeric);
    }
}
