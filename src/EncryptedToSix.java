public class EncryptedToSix  {
    private static final String AFTER_ENCRYPTED = "You text after encrypted.";
    private static final int numberSix = 6;
    private static final int buferValue = 100;
    static char[] arrayAfterEncrypted = new char[buferValue];
    public static void encryptedToSix(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char charFromArray = array[i];
            int codeChar = charFromArray + numberSix;
            arrayAfterEncrypted[i] = (char) codeChar;
        }
        System.out.println(arrayAfterEncrypted);
        System.out.println(AFTER_ENCRYPTED);
    }
}