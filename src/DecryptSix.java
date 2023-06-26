public class DecryptSix extends MyFileRider {
    private static final String AFTER_DECRYPTED = "You text after decrypted.";
    private static final int numberSix = 6;
    private static final int buferValue = 100;
    static char[] arrayAfterDecrypted = new char[buferValue];
    private static final int key = 1;
    public static void decryptedToSix(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char charFromArray = array[i];
            int codeChar = charFromArray - numberSix;
            arrayAfterDecrypted[i] = (char) codeChar;
        }
        System.out.println(arrayAfterDecrypted);
        System.out.println(AFTER_DECRYPTED);
    }
}


