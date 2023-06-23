public class DecryptThree extends MyFileRider {
    private static final String AFTER_ENCRYPTED = "You text after decrypted.";
    static char[] arrayAfterDecrypted = new char[100];
    private static final int key = 1;

    public static void decryptedToThree(char[] array) {

        for (int i = 0; i < array.length; i++) {
            char charFromArray = array[i];
            int codeChar = charFromArray - 3;
            arrayAfterDecrypted[i] = (char) codeChar;
        }
        System.out.println(arrayAfterDecrypted);
        System.out.println(AFTER_ENCRYPTED);


    }
}



